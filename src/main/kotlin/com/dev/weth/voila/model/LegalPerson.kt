package com.dev.weth.voila.model

import com.dev.weth.voila.enum.LegalPersonTypeEnum
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.PrimaryKeyJoinColumn
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "legal_person")
@PrimaryKeyJoinColumn(name = "person_id")
class LegalPerson(
    @Column(name = "cnpj")
    @NotNull
    @Size(max = 14)
    var cnpj: String,
    @Column(name = "company_name")
    @Size(max = 150)
    @NotNull
    var companyName: String,
    name: String,
    cellphone: String,
    image: ByteArray,
    user: User,
    @NotNull
    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    var type: LegalPersonTypeEnum) : Person(name, cellphone, image, user) {
}