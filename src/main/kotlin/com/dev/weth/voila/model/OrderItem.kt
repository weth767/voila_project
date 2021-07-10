package com.dev.weth.voila.model

import com.dev.weth.voila.model.pk.OrderItemPk
import javax.persistence.Column
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "order_item")
data class OrderItem(
    @EmbeddedId
    var id: OrderItemPk? = null,
    @Column(name = "amount")
    @NotNull
    var amount: Int = 0
)