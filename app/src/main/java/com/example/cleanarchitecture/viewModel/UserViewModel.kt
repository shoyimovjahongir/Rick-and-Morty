package com.example.cleanarchitecture.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecture.utils.UserResource
import com.example.domain.interactor.UserInteractor
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class UserViewModel @Inject constructor(private  val userInteractor: UserInteractor):ViewModel() {

    fun getUsers():StateFlow<UserResource>{
        val stateFlow=MutableStateFlow<UserResource>(UserResource.Loading)

        viewModelScope.launch {
            userInteractor.getUsers()
                .collect {
                    if (it.isSuccess){
                        stateFlow.emit(UserResource.Success(it.getOrNull()))
                    }else{

//                        stateFlow.emit(UserResource.Error)

                    }
                }
        }
        return  stateFlow
    }

}