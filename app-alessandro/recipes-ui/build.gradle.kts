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
    implementation(project(":app-alessandro:recipes-ui-model"))
    implementation(Dependency.Compose.FOUNDATION)
    implementation(Dependency.Compose.MATERIAL)
    implementation(Dependency.Compose.RUNTIME)
    implementation(Dependency.Compose.UI)
    implementation(Dependency.Compose.VIEW_MODEL)
}
