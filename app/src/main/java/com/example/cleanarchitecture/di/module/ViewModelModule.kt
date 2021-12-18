package com.example.cleanarchitecture.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchitecture.viewModel.DaggerViewModelFactory
import com.example.cleanarchitecture.viewModel.UserViewModel
import com.example.cleanarchitecture.viewModel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {


    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel::class)
    abstract fun bindsUserMyViewModel(viewModel: UserViewModel): ViewModel

    @Binds
    abstract fun bindsViewModelFactory(factoryDagger: DaggerViewModelFactory): ViewModelProvider.Factory
}
