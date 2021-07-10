package com.dev.weth.voila.model

import com.dev.weth.voila.enum.PaymentTypeEnum
import com.dev.weth.voila.enum.StatusOrderEnum
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "orders")
data class Order(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "date_time")
    @NotNull
    var datetime: LocalDateTime,
    @Column(name = "total_value")
    @NotNull
    var totalValue: BigDecimal,
    @Column(name = "need_exchange")
    @NotNull
    var needExchange: Boolean,
    @Column(name = "exchange_value")
    @NotNull
    var exchangeValue: BigDecimal,
    @Column(name = "payment_type")
    @NotNull
    @Enumerated(EnumType.ORDINAL)
    var paymentType: PaymentTypeEnum,
    @OneToOne
    @JoinColumn(name = "restaurant_id")
    @NotNull
    var restaurant: Restaurant,
    @OneToOne
    @JoinColumn(name = "deliveryman_id")
    @NotNull
    var deliveryman: Deliveryman,
    @OneToOne
    @JoinColumn(name = "client_id")
    @NotNull
    var client: Client,
    @Column(name = "need_delivery")
    @NotNull
    var needDelivery: Boolean,
    @Column(name = "status_order")
    @NotNull
    var status: StatusOrderEnum,
    @ManyToMany
    @JoinTable(name = "item_extra",
        joinColumns = [JoinColumn(name = "order_id")],
        inverseJoinColumns = [JoinColumn(name = "item_id")]
    )
    var orderItems: List<OrderItem> = emptyList()
)