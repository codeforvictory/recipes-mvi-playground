plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(AndroidApp.COMPILE_SDK)

    defaultConfig {
        minSdkVersion(AndroidApp.MIN_SDK)
        targetSdkVersion(AndroidApp.TARGET_SDK)
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Dependency.Compose.VERSION
    }
}

dependencies {
    implementation(project(":app-alessandro:recipes-ui"))
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation(Dependency.Compose.ACTIVITY)
}
