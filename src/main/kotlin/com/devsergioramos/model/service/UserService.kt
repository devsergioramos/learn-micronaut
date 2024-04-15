package com.devsergioramos.model.service

import com.devsergioramos.model.User
import com.devsergioramos.repository.UserRepository
import jakarta.inject.Singleton

@Singleton
class UserService (
    private val userRepository: UserRepository
) {
    fun create(user: User): User = userRepository.save(user)
}