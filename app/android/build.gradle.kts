plugins {
  id("com.android.application")
  kotlin("android")
}

android {
  compileSdkVersion(AndroidApp.COMPILE_SDK)

  defaultConfig {
    applicationId = AndroidApp.ID
    minSdkVersion(AndroidApp.MIN_SDK)
    targetSdkVersion(AndroidApp.TARGET_SDK)

    versionCode = AndroidApp.VERSION_CODE
    versionName = AndroidApp.VERSION_NAME

    testInstrumentationRunner = AndroidApp.INSTRUMENTATION_TEST_RUNNER
  }

  buildTypes {
    getByName("debug")
    getByName("release") {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  flavorDimensions("contributor")

  productFlavors {
    create("cesards")
  }
}

dependencies {
  "cesardsImplementation"(project(":app-cesards:app-init"))
}
