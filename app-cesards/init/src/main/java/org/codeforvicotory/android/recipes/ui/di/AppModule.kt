package org.codeforvicotory.android.recipes.ui.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class AppModule(private val application: Application) {

    @Provides
    @Singleton
    open fun provideContext(): Context = application

    @Provides
    @Singleton
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences("shared_pref", Context.MODE_PRIVATE)
    }

  /*@Provides
  @Singleton
  fun provideDatabaseService() =  DatabaseService()

  @Provides
  @Singleton
  fun provideNetworkService() = NetworkService()*/
}
