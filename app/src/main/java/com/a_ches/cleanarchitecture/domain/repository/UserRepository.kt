package com.a_ches.cleanarchitecture.domain.repository

import com.a_ches.cleanarchitecture.domain.models.SaveUserNameParam
import com.a_ches.cleanarchitecture.domain.models.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean {
        return true
    }

    fun getName(): UserName

}