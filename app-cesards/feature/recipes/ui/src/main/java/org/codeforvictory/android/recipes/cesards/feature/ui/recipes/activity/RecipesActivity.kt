package org.codeforvictory.android.recipes.cesards.feature.ui.recipes.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.codeforvictory.android.recipes.cesards.feature.ui.recipes.di.DaggerRecipesComponent
import org.codeforvictory.android.recipes.cesards.feature.ui.recipes.di.RecipesParentComponent
import org.codeforvictory.android.recipes.cesards.feature.ui.recipes.viewmodel.RecipesViewModel
import javax.inject.Inject

class RecipesActivity : AppCompatActivity() {

    @Inject lateinit var loginViewModel: RecipesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerRecipesComponent.builder()
            .parent((application as RecipesParentComponent.Provision).recipesParentComponent())
            .build()
            .inject(this)

        super.onCreate(savedInstanceState)
    }
}
