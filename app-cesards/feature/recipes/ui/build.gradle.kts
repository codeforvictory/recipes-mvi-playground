apply(from = "$rootDir/gradle/android-library-common.gradle")

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
}

android {
    viewBinding {
        android.buildFeatures.viewBinding = true
    }

    /*kotlinOptions {
      useIR = true
    }

    buildFeatures {
      compose = true
    }

    composeOptions {
      kotlinCompilerExtensionVersion = Dependency.Compose.VERSION
      kotlinCompilerVersion = Dependency.Kotlin.VERSION
    }*/
}

dependencies {
    // implementationMultiple(Dependency.Compose.all)

    implementation(project(":app-cesards:platform:ui:design"))
    implementation(project(":app-cesards:feature:recipes:domain"))

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")

    kapt("com.google.dagger:dagger-compiler:2.21")
    implementation("com.google.dagger:dagger:2.28.3")
}
