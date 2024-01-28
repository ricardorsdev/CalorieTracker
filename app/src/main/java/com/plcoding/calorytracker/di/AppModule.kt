package com.plcoding.calorytracker.di

import android.app.Application
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.example.core_data.preferences.DefaultPreferences
import com.example.core_domain.preferences.Preferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesSharedPreferences(App: Application): SharedPreferences {
        return App.getSharedPreferences(
            "shared_pref",
            MODE_PRIVATE
        )
    }

    @Provides
    @Singleton
    fun providesPreferences(sharedPref: SharedPreferences): Preferences {
        return DefaultPreferences(sharedPref)
    }
}