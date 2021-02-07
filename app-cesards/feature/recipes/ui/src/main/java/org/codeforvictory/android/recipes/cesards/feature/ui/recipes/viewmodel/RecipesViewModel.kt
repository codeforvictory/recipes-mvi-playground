package org.codeforvictory.android.recipes.cesards.feature.ui.recipes.viewmodel

import androidx.lifecycle.ViewModel
import org.codeforvictory.android.recipes.cesards.feature.recipes.domain.GetRecipes
import javax.inject.Inject

class RecipesViewModel @Inject constructor(getRecipes: GetRecipes) : ViewModel()
