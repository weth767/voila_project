package com.dev.weth.voila.model

import com.dev.weth.voila.enum.GenderEnum
import com.dev.weth.voila.enum.VehicleTypeEnum
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "deliveryman")
@PrimaryKeyJoinColumn(name = "person_id")
class Deliveryman(
    @Column(name = "cpf")
    @Size(max = 11)
    var cpf: String,
    @Column(name = "cnpj")
    @Size(max = 14)
    var cnpj: String,
    @Column(name = "birthday")
    var birthday: LocalDate,
    @Column(name = "gender")
    var gender: GenderEnum,
    @Column(name = "company_name")
    @Size(max = 150)
    var companyName: String,
    @Column(name = "vehicle_type")
    @Enumerated(EnumType.ORDINAL)
    var vehicleType: VehicleTypeEnum,
    name: String,
    cellphone: String,
    image: ByteArray,
    user: User) :
    Person(name, cellphone, image, user)