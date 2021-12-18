package com.example.cleanarchitecture.utils

import com.example.domain.models2.UserData2


sealed class UserResource{

    object Loading:UserResource()
    data class Error(val message:String):UserResource()
    data class Success(val list:UserData2?):UserResource()

}
