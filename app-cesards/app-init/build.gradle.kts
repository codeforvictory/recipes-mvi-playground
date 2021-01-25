apply(from = "$rootDir/gradle/android-library-common.gradle")

plugins {
  id("com.android.library")
  kotlin("android")
}

dependencies {
  implementation(project(":app-cesards:ui"))
}
