package org.codeforvictory.android.recipes.data.api.recipe

import org.codeforvictory.android.recipes.data.api.recipe.model.ApiMeal
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

internal class AdaptToMealTest {

    private val adaptToMeal = AdaptToMeal()

    @Test
    fun `invoke - should convert api into domain meal data`() {
        // Given
        val apiMeal = ApiMeal("id", "name", "http://www.image-thumbnail.com/image.png")

        // When
        val result = adaptToMeal(apiMeal)

        // Then
        assertAll(
            { assertEquals(apiMeal.id, result.id) },
            { assertEquals(apiMeal.name, result.name) },
            { assertEquals(apiMeal.imageThumbnailUrl, result.imageThumbUrl) },
        )
    }
}
