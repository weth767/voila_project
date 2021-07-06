package com.dev.weth.voila.model

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "address")
data class Address(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long? = null,
    @OneToOne(fetch = FetchType.LAZY,cascade = [CascadeType.ALL])
    @JoinColumn(name = "person_id")
    var person: Person? = null,
    @Column(name = "street")
    @NotNull
    var street: String,
    @Column(name = "number")
    @NotNull
    var number: String,
    @Column(name = "neighborhood")
    @NotNull
    var neighborhood: String,
    @Column(name = "complement")
    var complement: String,
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    @NotNull
    var city: City)