package org.codeforvicotory.android.recipes.ui

import android.app.Application
import org.codeforvicotory.android.recipes.ui.di.AppComponent
import org.codeforvicotory.android.recipes.ui.di.DaggerAppComponent
import org.codeforvictory.android.recipes.cesards.feature.ui.recipes.di.RecipesParentComponent

class RecipesApp : Application(), RecipesParentComponent.Provision {
    private val appComponent: AppComponent by lazy(LazyThreadSafetyMode.NONE) {
        DaggerAppComponent.builder()
            .application(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()

        appComponent.inject(this)
    /*appComponent = DaggerAppComponent.builder()
      .appModule(AppModule(this))
      .build()*/
    }

    // override fun recipesParentComponent(): RecipesParentComponent = appComponent
    override fun recipesParentComponent(): RecipesParentComponent = appComponent
}
