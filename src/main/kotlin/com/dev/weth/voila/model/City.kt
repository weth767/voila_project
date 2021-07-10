package com.dev.weth.voila.model

import com.dev.weth.voila.enum.StateEnum
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "city")
data class City(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    var name: String,
    var state: StateEnum)