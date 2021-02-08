package org.codeforvictory.android.recipes.cesards.feature.ui.recipes.di

import org.codeforvictory.android.recipes.cesards.feature.recipes.domain.repository.RecipeRepository

interface RecipesParentComponent {

    fun recipeRepository(): RecipeRepository

    interface Provision {
        fun recipesParentComponent(): RecipesParentComponent
    }
}
