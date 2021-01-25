package org.codeforvictory.android.recipes.data.api.recipe

import retrofit2.Retrofit

internal class RecipeServiceProvider(private val retrofit: Retrofit = RetrofitProvider.value) {

    private var singleton: RecipeService? = null
    val value: RecipeService
        get() {
            if (singleton == null) {
                synchronized(this) {
                    singleton = retrofit.create(RecipeService::class.java)
                }
            }
            return singleton!!
        }
}
