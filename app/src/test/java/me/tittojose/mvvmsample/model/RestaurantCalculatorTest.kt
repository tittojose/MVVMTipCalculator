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


        val baseTc = TipCalculation(checkAmount = 10.00)

        val testVals = listOf(baseTc.copy(tipPct = 25, tipAmount = 2.5, grandTotal = 12.5),
                baseTc.copy(tipPct = 15, tipAmount = 1.5, grandTotal = 11.5),
                baseTc.copy(tipPct = 18, tipAmount = 1.8, grandTotal = 11.80))

        testVals.forEach {
            assertEquals(it, calculator.calculateTip(it.checkAmount, it.tipPct))
        }

//        val checkInput = 10.00
//        val tipPct = 25
//
//        val expectedTipresult = TipCalculation(
//                checkAmount = checkInput,
//                tipPct = 25,
//                tipAmount = 2.50,
//                grandTotal = 12.50
//        )
//
//        assertEquals(expectedTipresult, calculator.calculateTip(checkInput, tipPct))
    }
}