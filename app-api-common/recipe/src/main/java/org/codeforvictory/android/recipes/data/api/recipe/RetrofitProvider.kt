package org.codeforvictory.android.recipes.data.api.recipe

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitProvider {

    val value: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
}
