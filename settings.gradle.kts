rootProject.name = "Recipes MVI Playground"

apply(from = "$rootDir/app-cesards/settings.gradle")

include(
    ":app:android",
    ":app-ui-common:recipe",
    ":app-api-common:recipe",
    ":app-domain-common:model"
)
