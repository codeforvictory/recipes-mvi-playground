package org.codeforvictory.android.recipes.data.api.recipe

import org.codeforvictory.recipes.domain.common.model.meal.Meal

class RecipeApiSource(
    private val adaptToMeal: AdaptToMeal = AdaptToMeal(),
    private val recipeService: RecipeService = RecipeServiceProvider().value,
) {

    suspend fun all(): Result<List<Meal>> {
        return runCatching {
            recipeService.filter().let { response ->
                response.meals.map { apiMeal -> adaptToMeal(apiMeal) }
            }
        }
    }
}
