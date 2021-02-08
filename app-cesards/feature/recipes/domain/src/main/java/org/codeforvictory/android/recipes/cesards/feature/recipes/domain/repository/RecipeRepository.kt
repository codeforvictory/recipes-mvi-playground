package org.codeforvictory.android.recipes.cesards.feature.recipes.domain.repository

interface RecipeRepository {
    fun filterBy(country: String = "USA"): List<String>
}
