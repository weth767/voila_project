package com.dev.weth.voila.model

import com.dev.weth.voila.enum.UserTypeEnum
import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size

@Entity
@Table(name = "user")
data class User (
    @Id
    @Column(name = "email")
    @NotNull
    @Email
    @Size(max = 150)
    var email: String,
    @NotNull
    @Column(name = "password")
    @NotBlank
    @NotEmpty
    @Size(max = 200)
    var password: String,
    @Column(name = "user_type")
    @Enumerated(EnumType.ORDINAL)
    @NotNull
    var userType: UserTypeEnum,
    @OneToOne(mappedBy = "user",cascade = [CascadeType.ALL])
    var person: Person) {
}