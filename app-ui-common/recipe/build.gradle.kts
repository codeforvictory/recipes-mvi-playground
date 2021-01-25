apply(from = "$rootDir/gradle/android-library-common.gradle")

plugins {
  id("com.android.library")
  kotlin("android")
}

dependencies {
  implementation("com.google.android.material:material:1.2.1")
  implementation("androidx.compose.material:material:1.0.0-alpha10")
}