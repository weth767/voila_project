package com.dev.weth.voila.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "rating_restaurant")
data class RatingRestaurant(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long? = null,
    @JoinColumn(name = "restaurant_id")
    @ManyToOne
    @NotNull
    var restaurant: Restaurant,
    @Column(name = "stars")
    @NotNull
    var stars: Short,
    @Column(name = "observation")
    var observation: String
)