package org.codeforvictory.android.recipes.data.api.recipe.model

import com.squareup.moshi.Json

data class ApiMeal(
    @Json(name = "idMeal") val id: String,
    @Json(name = "strMeal") val name: String,
    @Json(name = "strMealThumb") val imageThumbnailUrl: String,
)
