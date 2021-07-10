package com.dev.weth.voila.model

import com.dev.weth.voila.enum.GenderEnum
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "natural_person")
@PrimaryKeyJoinColumn(name = "person_id")
class Client(
    @Column(name = "cpf")
    @NotNull
    @Size(max = 11)
    var cpf: String,
    @NotNull
    @Column(name = "birthday")
    var birthday: LocalDate,
    @Column(name = "gender")
    var gender: GenderEnum,
    name: String,
    cellphone: String,
    image: ByteArray,
    user: User) :
    Person(name, cellphone, image, user)