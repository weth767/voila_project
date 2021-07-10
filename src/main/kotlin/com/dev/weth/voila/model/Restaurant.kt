package com.dev.weth.voila.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "restaurant")
@PrimaryKeyJoinColumn(name = "person_id")
class Restaurant(
    @Column(name = "cnpj")
    @NotNull
    @Size(max = 14)
    var cnpj: String,
    @Column(name = "company_name")
    @Size(max = 150)
    @NotNull
    var companyName: String,
    @Column(name = "is_open")
    @NotNull
    var open: Boolean,
    @ManyToMany()
    @JoinTable(name = "deliveryman_restaurant",
        joinColumns = [JoinColumn(name = "restaurant_id")],
        inverseJoinColumns = [JoinColumn(name = "deliveryman_id")]
    )
    var deliverymen: List<Deliveryman> = emptyList(),
    name: String,
    cellphone: String,
    image: ByteArray,
    user: User) : Person(name, cellphone, image, user)