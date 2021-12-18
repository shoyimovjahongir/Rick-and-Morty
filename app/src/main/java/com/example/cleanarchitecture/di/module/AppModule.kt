package com.example.cleanarchitecture.di.module

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
//    fun provideBaseUrl():String="https://jsonplaceholder.typicode.com/"
    fun provideBaseUrl():String="https://rickandmortyapi.com/"
//    fun provideBaseUrl():String="https://guidebook.com/service/v2/"
//    fun provideBaseUrl():String="https://guidebook.com/"

    @Provides
    @Singleton
    fun provideRetrofit(baseUrl:String):Retrofit{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
//            .baseUrl(baseUr)
            .baseUrl(provideBaseUrl())
            .build()
    }
}