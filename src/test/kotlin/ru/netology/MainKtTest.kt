package ru.netology

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun calculatePriceUserLevelGoldDiscount() {
        val itemCount = 11
        val expected = 900

        val result = calculatePrice(
            itemCount = itemCount,
            userLevel = "gold",
        )

        assertEquals(expected, result)
    }

    @Test
    fun calculatePriceUserLevelGold() {
        val itemPrice = 100
        val itemCount = 11
        val discount = 100
        val discountStart = 2_000
        val expected = 990

        val result = calculatePrice(
            itemCount = itemCount,
            itemPrice = itemPrice,
            discount = discount,
            discountStart = discountStart,
            userLevel = "gold",
        )

        assertEquals(expected, result)
    }
}