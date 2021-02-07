package org.codeforvicotory.android.recipes.ui.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import org.codeforvicotory.android.recipes.ui.RecipesApp
import org.codeforvictory.android.recipes.cesards.feature.ui.recipes.di.RecipesParentComponent
import org.codeforvictory.recipes.cesards.data.di.RecipesDataModule
import javax.inject.Singleton

@Singleton
@Component(modules = [RecipesDataModule::class])
interface AppComponent : RecipesParentComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(recipesApp: RecipesApp): Builder
        fun build(): AppComponent
    }

    fun inject(app: Application)

    // fun getNetworkService(): NetworkService
    // fun getDatabaseService(): DatabaseService
}
