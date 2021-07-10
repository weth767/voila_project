package com.dev.weth.voila.repository

import com.dev.weth.voila.model.Deliveryman
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DeliverymanRepository: JpaRepository<Deliveryman, Long> {
}