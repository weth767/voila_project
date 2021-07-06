package com.dev.weth.voila.repository

import com.dev.weth.voila.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, String> {
}