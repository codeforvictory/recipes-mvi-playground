buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${AndroidApp.AGP_VERSION}")
        classpath(kotlin("gradle-plugin", version = Dependency.Kotlin.VERSION))
    }
}

plugins {
    // https://plugins.gradle.org/plugin/com.diffplug.spotless
    id("com.diffplug.spotless") version "5.10.2" apply true
    // https://plugins.gradle.org/plugin/io.gitlab.arturbosch.detekt
    id("io.gitlab.arturbosch.detekt") version "1.17.1"
}

// Use allprojects API instead of subprojects for repository provision, since it also provides build's plugins block dependencies.
allprojects {
    repositories {
        google()
        jcenter()
    }
}

detekt {
    config = files("$rootDir/ci/detekt/project-config.yml")
    buildUponDefaultConfig = true
}

subprojects {
    apply {
        plugin("com.diffplug.spotless")
        plugin("io.gitlab.arturbosch.detekt")
    }

    // If we are using build.gradle.kts, instead of 'spotless {' use the following:
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        kotlin {
            target("**/src/**/*.kt", "**/src/**/*.kts")
            ktlint("0.40.0")
        }
        // https://github.com/pinterest/ktlint/issues/716
        // https://github.com/pinterest/ktlint/issues/963
        kotlinGradle {
            target("*.gradle.kts") // default target for kotlinGradle
            ktlint() // or ktfmt() or prettier()
        }
    }
}
