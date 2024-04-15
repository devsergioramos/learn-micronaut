package com.devsergioramos.model.request

data class UserRequest(
    val name: String,
    val email: String,
    val street: String,
    val city: String,
    val code: Int
)
