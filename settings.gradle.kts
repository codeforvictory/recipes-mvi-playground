rootProject.name = "Recipes MVI Playground"

apply(from = "$rootDir/app-cesards/settings.gradle")
apply(from = "$rootDir/app-alessandro/settings.gradle")

include(
    ":app:android",
    ":app-entity:recipe:ui",
    ":app-entity:recipe:domain",
    ":app-entity:recipe:data"
)
