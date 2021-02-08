apply(from = "$rootDir/gradle/android-library-common.gradle")

plugins {
  id("com.android.library")
  kotlin("android")
  kotlin("kapt")
}

dependencies {
  implementation(project(":app-cesards:feature:recipes:domain"))
  kapt("com.google.dagger:dagger-compiler:2.21")
  implementation("com.google.dagger:dagger:2.28.3")
}
