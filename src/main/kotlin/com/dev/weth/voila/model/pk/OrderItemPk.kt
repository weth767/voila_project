package com.dev.weth.voila.model.pk

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class OrderItemPk(
    @Column(name = "order_id")
    var orderId: Long,
    @Column(name = "item_id")
    var itemId: Long
)