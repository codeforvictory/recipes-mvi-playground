apply(from = "$rootDir/gradle/android-library-common.gradle")

plugins {
  id("com.android.library")
  kotlin("android")
}

android {
  viewBinding {
    android.buildFeatures.viewBinding = true
  }

  kotlinOptions {
    useIR = true
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = Dependency.Compose.VERSION
    kotlinCompilerVersion = Dependency.Kotlin.VERSION
  }
}

dependencies {
  implementation("androidx.appcompat:appcompat:1.2.0")

  implementationMultiple(Dependency.Compose.all)

  implementation(project(":app-cesards:ui-common"))
}
