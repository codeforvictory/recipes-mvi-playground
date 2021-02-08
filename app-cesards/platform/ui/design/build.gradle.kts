apply(from = "$rootDir/gradle/android-library-common.gradle")

plugins {
    id("com.android.library")
    kotlin("android")
}

dependencies {
    api("com.google.android.material:material:1.2.1")
    api("androidx.appcompat:appcompat:1.2.0")
}
