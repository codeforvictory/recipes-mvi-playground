package org.codeforvictory.android.recipes.data.api.recipe.model

import com.squareup.moshi.Json

data class ApiMealsResponse(
    @Json(name = "meals") val meals: List<ApiMeal>
)
