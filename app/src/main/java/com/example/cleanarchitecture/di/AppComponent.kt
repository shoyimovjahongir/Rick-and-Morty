package com.example.cleanarchitecture.di

import com.example.cleanarchitecture.App
import com.example.cleanarchitecture.di.module.DataModule
import com.example.cleanarchitecture.di.module.AppModule
import com.example.cleanarchitecture.di.module.ViewModelModule
import com.example.cleanarchitecture.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, DataModule::class, ViewModelModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance app: App
        ): AppComponent
    }

    fun inject(mainActivity: MainActivity)
}