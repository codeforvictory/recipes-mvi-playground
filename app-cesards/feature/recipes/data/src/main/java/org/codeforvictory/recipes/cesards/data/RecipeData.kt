package org.codeforvictory.recipes.cesards.data

import org.codeforvictory.android.recipes.cesards.feature.recipes.domain.repository.RecipeRepository
import javax.inject.Inject

internal class RecipeData @Inject constructor() : RecipeRepository {
    override fun filterBy(country: String): List<String> {
        TODO("Not yet implemented")
    }
}
