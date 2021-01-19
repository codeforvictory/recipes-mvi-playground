import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.implementationMultiple(dependencies: List<String>, buildVariant: String = "") {
    addDependencies(dependencies, "implementation$buildVariant")
}

fun DependencyHandler.api(dependencies: List<String>, buildVariant: String = "") {
    addDependencies(dependencies, "api$buildVariant")
}

fun DependencyHandler.kapt(dependencies: List<String>, buildVariant: String = "") {
    addDependencies(dependencies, "kapt$buildVariant")
}

fun DependencyHandler.testImplementation(dependencies: List<String>, buildVariant: String = "") {
    addDependencies(dependencies, "testImplementation$buildVariant")
}

fun DependencyHandler.androidTestImplementation(dependencies: List<String>, buildVariant: String = "") {
    addDependencies(dependencies, "androidTestImplementation$buildVariant")
}

private fun DependencyHandler.addDependencies(dependencies: List<String>, configurationName: String) {
    dependencies.forEach { dependency ->
        add(configurationName, dependency)
    }
}

object Dependency {
    object Kotlin {
        const val VERSION = "1.4.21"

        const val STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$VERSION"
        const val GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:$VERSION"
        const val ANDROID_EXTENSIONS = "org.jetbrains.kotlin:kotlin-android-extensions:$VERSION"
    }

    object Coroutines {
        private const val VERSION = "1.3.9"

        const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VERSION"
        const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VERSION"
        const val TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$VERSION"
    }

    object Compose {
        const val VERSION = "1.0.0-alpha10"

        private const val UI = "androidx.compose.ui:ui:$VERSION"
        private const val ANIMATION = "androidx.compose.animation:animation:$VERSION"
        private const val MATERIAL = "androidx.compose.material:material:$VERSION"
        private const val FOUNDATION = "androidx.compose.foundation:foundation:$VERSION"
        private const val COMPILER = "androidx.compose.compiler:compiler:$VERSION"
        private const val RUNTIME = "androidx.compose.runtime:runtime:$VERSION"
        // const val RUNTIME_LIVEDATA = "androidx.compose.runtime:runtime-livedata:$VERSION"
        // const val RUNTIME_RXJAVA = "androidx.compose.runtime:runtime-rxjava2:$VERSION"

        val all = listOf(ANIMATION, COMPILER, FOUNDATION, MATERIAL, RUNTIME, UI)
    }

    object OkHttp {
        private const val VERSION = "4.7.2"
        const val CORE = "com.squareup.okhttp3:okhttp:$VERSION"
        const val LOGGING = "com.squareup.okhttp3:logging-interceptor:$VERSION"
    }
}

// const val androidGradlePlugin = "com.android.tools.build:gradle:4.2.0-alpha14"
// const val jdkDesugar = "com.android.tools:desugar_jdk_libs:1.0.10"
// const val junit = "junit:junit:4.13"
// const val material = "com.google.android.material:material:1.2.1"
