package org.codeforvictory.android.recipes.data.api.recipe

import org.codeforvictory.android.recipes.data.api.recipe.model.ApiMealsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeService {

    @GET
    suspend fun filter(@Query("a") area: String = "American"): ApiMealsResponse
}
