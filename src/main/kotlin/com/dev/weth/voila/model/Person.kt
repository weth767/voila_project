package com.dev.weth.voila.model

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Inheritance
import javax.persistence.InheritanceType
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size


@Entity
@Table(name = "Person")
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Person(
    @Column(name = "name")
    @NotNull
    @Size(max = 120)
    var name: String,
    @Column(name = "cellphone")
    @NotNull
    @Size(max = 11)
    var cellphone: String,
    var image: ByteArray,
    @NotNull
    @JoinColumn(name = "user_id")
    @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var user: User) {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
}