package org.codeforvictory.android.recipes.data.api.recipe

import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeInstanceOf
import org.codeforvictory.android.recipes.data.api.recipe.model.ApiMeal
import org.codeforvictory.android.recipes.data.api.recipe.model.ApiMealsResponse
import org.codeforvictory.recipes.domain.common.model.meal.Meal
import org.junit.jupiter.api.Test

internal class RecipeApiSourceTest {

  private val adaptToMeal : AdaptToMeal = mockk()
  private val recipeService : RecipeService = mockk()
  private val recipeApiSource = RecipeApiSource(adaptToMeal, recipeService)

  @Test
  fun `all - should return a list of meals when request is successful`() = runBlockingTest {
    // Given
    val apiMeals = listOf(
      ApiMeal("id-1", "name-1", "image-1"),
      ApiMeal("id-2", "name-2", "image-2"),
      ApiMeal("id-3", "name-3", "image-3"),
    )
    val expectedMeals = apiMeals.map { apiMeal -> Meal(apiMeal.id, apiMeal.name, apiMeal.imageThumbnailUrl) }

    apiMeals.forEachIndexed { index, apiMeal ->
      every { adaptToMeal(apiMeal) } returns expectedMeals[index]
    }

    coEvery { recipeService.filter() } returns ApiMealsResponse(meals = apiMeals)

    // When
    val result = recipeApiSource.all()

    // Then
    result shouldBeEqualTo Result.success(expectedMeals)
  }

  @Test
  fun `all - should return error when request is unsuccessful`() = runBlockingTest {
    "" shouldBeEqualTo null
  }
}
