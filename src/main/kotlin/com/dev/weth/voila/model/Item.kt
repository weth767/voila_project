package com.dev.weth.voila.model

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.OneToOne
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Entity
@Table(name = "item")
data class Item(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long? = null,
    @Column(name = "description")
    @NotNull
    var description: String,
    @Column(name = "price")
    @NotNull
    var price: BigDecimal,
    @Column(name = "is_active")
    @NotNull
    var isActive: Boolean,
    @Column(name = "image")
    var image: List<Byte> = emptyList(),
    @OneToOne
    @JoinColumn(name = "restaurant_id")
    @NotNull
    var restaurant: Restaurant,
    @ManyToOne
    @JoinColumn(name = "item_category_id")
    @NotNull
    var itemCategory: ItemCategory,
    @ManyToMany
    @JoinTable(name = "item_extra",
        joinColumns = [JoinColumn(name = "item_id")],
        inverseJoinColumns = [JoinColumn(name = "extra_id")]
    )
    var extras: List<Extra> = emptyList()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Item

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }
}