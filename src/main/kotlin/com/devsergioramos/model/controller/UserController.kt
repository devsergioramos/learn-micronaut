package com.devsergioramos.model.controller

import com.devsergioramos.model.Address
import com.devsergioramos.model.User
import com.devsergioramos.model.request.UserRequest
import com.devsergioramos.model.service.UserService
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Status

@Controller("/user")
class UserController (
    private val userService: UserService
) {
    @Post
    @Status(HttpStatus.CREATED)
    fun create(userRequest: UserRequest) = userService.create(user = userRequest.toModel())

    private fun UserRequest.toModel() : User = User(
            name = this.name,
            email = this.email,
            address = Address(
                street = this.street,
                city = this.city,
                code = this.code
            )
        )
}