package com.example.binusapp

import android.app.Application
import com.google.firebase.FirebaseApp
import com.example.binusapp.data.prefs.AppPreferences

class BaseApplication : Application() {

    companion object {
        lateinit var instance: BaseApplication
        lateinit var appPreferences: AppPreferences
    }

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)

        instance = this
        appPreferences = AppPreferences(this)
    }
}