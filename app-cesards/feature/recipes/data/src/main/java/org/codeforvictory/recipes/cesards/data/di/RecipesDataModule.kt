package org.codeforvictory.recipes.cesards.data.di

import dagger.Binds
import dagger.Module
import org.codeforvictory.android.recipes.cesards.feature.recipes.domain.repository.RecipeRepository
import org.codeforvictory.recipes.cesards.data.RecipeData

@Module
abstract class RecipesDataModule {
  @Binds
  internal abstract fun bindsRecipeData(recipeData: RecipeData) : RecipeRepository
}
