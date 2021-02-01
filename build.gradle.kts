buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:7.0.0-alpha05")
    classpath(kotlin("gradle-plugin", version = Dependency.Kotlin.VERSION))
  }
}

plugins {
  // https://plugins.gradle.org/plugin/com.diffplug.spotless
  id("com.diffplug.spotless") version "5.9.0" apply true
  // https://plugins.gradle.org/plugin/io.gitlab.arturbosch.detekt
  id("io.gitlab.arturbosch.detekt") version "1.15.0"
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

  spotless {
    kotlin {
      target("**/src/**/*.kt", "**/src/**/*.kts")
      ktlint("0.40.0")
    }
  }
}
