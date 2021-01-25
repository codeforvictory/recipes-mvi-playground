package org.codeforvictory.android.recipes.data.api.recipe.model

import com.squareup.moshi.Json

class ApiMealsResponse(
  @Json(name = "meals") val meals : List<ApiMeal>
)
