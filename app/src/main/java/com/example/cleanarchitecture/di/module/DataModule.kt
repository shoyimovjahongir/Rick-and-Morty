package com.example.cleanarchitecture.di.module

import com.example.data.network.ApiService
import com.example.data.repository.UserRepositoryImp
import com.example.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [DataModule.BindModule::class])
class DataModule {


    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Module
    abstract class BindModule{

        @Binds
        abstract  fun bindApiRepository(userRepositoryImp: UserRepositoryImp): UserRepository
    }
}