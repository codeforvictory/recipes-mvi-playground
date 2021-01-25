package org.codeforvictory.android.recipes.data.api.recipe

import org.amshove.kluent.shouldBeEqualTo
import org.codeforvictory.android.recipes.data.api.recipe.model.ApiMeal
import org.junit.jupiter.api.Test

internal class AdaptToMealTest {

    private val adaptToMeal = AdaptToMeal()

    @Test
    fun `invoke - should convert api into domain meal data`() {
        // Given
        val apiMeal = ApiMeal("id", "name", "http://www.image-thumbnail.com/image.png")

        // When
        val result = adaptToMeal(apiMeal)

        // Then
        result.id shouldBeEqualTo apiMeal.id
        result.name shouldBeEqualTo apiMeal.name
        result.imageThumbUrl shouldBeEqualTo apiMeal.imageThumbnailUrl
    }
}
