package com.a_ches.cleanarchitecture.data.storage

import com.a_ches.cleanarchitecture.data.storage.models.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User




}