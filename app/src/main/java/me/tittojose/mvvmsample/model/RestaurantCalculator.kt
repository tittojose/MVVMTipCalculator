package me.tittojose.mvvmsample.model

import java.math.RoundingMode

/**
 * Created by Jose.
 */
class RestaurantCalculator {
    fun calculateTip(checkInput: Double, tipPct: Int): TipCalculation {
        val tipAmount = (checkInput * (tipPct.toDouble() / 100))
                .toBigDecimal()
                .setScale(2, RoundingMode.HALF_UP)
                .toDouble()

        val grandTotal = checkInput + tipAmount
        return TipCalculation(
                tipAmount = tipAmount,
                grandTotal = grandTotal,
                tipPct = tipPct,
                checkAmount = checkInput
        )
    }
}