buildscript {
  repositories {
    google()
    jcenter()
  }
  dependencies {
    classpath("com.android.tools.build:gradle:7.0.0-alpha04")
    classpath(kotlin("gradle-plugin", version = Dependency.Kotlin.VERSION))
  }
}

allprojects {
  repositories {
    google()
    jcenter()
  }
}

tasks.register("clean", Delete::class) {
  delete(rootProject.buildDir)
}
