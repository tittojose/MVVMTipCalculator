package me.tittojose.mvvmsample.model

import me.tittojose.mvvmsample.model.RestaurantCalculator
import me.tittojose.mvvmsample.model.TipCalculation
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by Jose.
 */
class RestaurantCalculatorTest {
    lateinit var calculator: RestaurantCalculator

    @Before
    fun setup() {
        calculator = RestaurantCalculator()
    }

    @Test
    fun testCalculateTip() {
        val checkInput = 10.00
        val tipPct = 25

        val expectedTipresult = TipCalculation(
                checkAmount = checkInput,
                tipPct = 25,
                tipAmount = 2.50,
                grandTotal = 12.50
        )

        assertEquals(expectedTipresult, calculator.calculateTip(checkInput, tipPct))
    }
}