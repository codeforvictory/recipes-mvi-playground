package org.codeforvictory.android.recipes.cesards.feature.ui.recipes.di

import dagger.Component
import org.codeforvictory.android.recipes.cesards.feature.ui.recipes.activity.RecipesActivity

@Component(
    dependencies = [RecipesParentComponent::class],
    modules = [RecipesUiModule::class]
)
internal interface RecipesComponent {
    fun inject(recipesActivity: RecipesActivity)

    @Component.Builder
    interface Builder {
        fun parent(parent: RecipesParentComponent): Builder
        fun build(): RecipesComponent
    }
}
