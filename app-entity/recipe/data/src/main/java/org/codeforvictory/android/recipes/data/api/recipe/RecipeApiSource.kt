package org.codeforvictory.android.recipes.data.api.recipe

import org.codeforvictory.recipes.domain.common.model.meal.Meal
import javax.inject.Inject

class RecipeApiSource @Inject constructor (
    private val adaptToMeal: AdaptToMeal,
    private val recipeService: RecipeService,
) {
    suspend fun all(): Result<List<Meal>> {
        return runCatching {
            recipeService.recipesBy().let { response ->
                response.meals.map { apiMeal -> adaptToMeal(apiMeal) }
            }
        }
    }
}
