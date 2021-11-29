package com.a_ches.cleanarchitecture.data.repository


import com.a_ches.cleanarchitecture.data.storage.models.User
import com.a_ches.cleanarchitecture.data.storage.UserStorage
import com.a_ches.cleanarchitecture.domain.models.SaveUserNameParam
import com.a_ches.cleanarchitecture.domain.models.UserName
import com.a_ches.cleanarchitecture.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository{

    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val user = User(firstName = saveParam.name, lastName = "")
        val result1 = userStorage.save(user)
        return result1
    }

    override fun getName(): UserName {
        val user = userStorage.get()
        val userName = UserName(firstName = user.firstName, lastName = user.lastName)
        return userName
    }


}