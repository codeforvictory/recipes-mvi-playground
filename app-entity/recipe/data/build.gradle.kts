apply(from = "$rootDir/gradle/android-library-common.gradle")

plugins {
    id("com.android.library")
    kotlin("android")
}

dependencies {
    implementation("javax.inject:javax.inject:1")

    implementation(project(":app-entity:recipe:domain"))

    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")

    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.4.2")
    testImplementation("io.mockk:mockk:1.10.6")
    testImplementation("org.amshove.kluent:kluent:1.65")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
