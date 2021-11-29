package com.a_ches.cleanarchitecture.domain.usecace

import com.a_ches.cleanarchitecture.data.repository.UserRepositoryImpl
import com.a_ches.cleanarchitecture.domain.models.SaveUserNameParam
import com.a_ches.cleanarchitecture.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) { //UserRepository - интерфейс

    fun execute(param: SaveUserNameParam): Boolean {

        val oldUserName = userRepository.getName()

        if(oldUserName.firstName == param.name) {
            return true
        }

        val result: Boolean = userRepository.saveName(saveParam = param)
        return result


    }
}