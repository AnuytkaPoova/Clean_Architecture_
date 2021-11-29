package com.a_ches.cleanarchitecture.domain.usecace

import com.a_ches.cleanarchitecture.domain.models.UserName
import com.a_ches.cleanarchitecture.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()


       }
}