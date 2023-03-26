package com.example.movieslist

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MoviesListApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}