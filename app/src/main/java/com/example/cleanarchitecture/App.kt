package com.example.cleanarchitecture

import android.app.Application
import com.example.cleanarchitecture.di.AppComponent
import com.example.cleanarchitecture.di.DaggerAppComponent
import javax.inject.Inject

class App @Inject constructor() : Application() {

    companion object{
        lateinit var appComponent: AppComponent
    }
    override fun onCreate() {
        super.onCreate()

//        appComponent= DaggerAppComponent.builder().build()
        appComponent= DaggerAppComponent
            .factory()
            .create(this)

    }
}