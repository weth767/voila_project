package com.dev.weth.voila.repository

import com.dev.weth.voila.model.Restaurant
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RestaurantRepository: JpaRepository<Restaurant, Long> {
}