package com.devsergioramos.repository

import com.devsergioramos.model.User
import io.micronaut.data.mongodb.annotation.MongoRepository
import io.micronaut.data.repository.CrudRepository

@MongoRepository
interface UserRepository : CrudRepository<User, String>