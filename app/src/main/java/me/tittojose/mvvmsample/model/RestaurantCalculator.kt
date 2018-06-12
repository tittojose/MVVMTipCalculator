package me.tittojose.mvvmsample.model

/**
 * Created by Jose.
 */
class RestaurantCalculator {
    fun calculateTip(checkInput: Double, tipPct: Int): TipCalculation {
        val tipRatio = tipPct.toDouble() / 100
        val tipAmount = tipRatio * checkInput
        val grandTotal = checkInput + tipAmount
        return TipCalculation(
                tipAmount = tipAmount,
                grandTotal = grandTotal,
                tipPct = tipPct,
                checkAmount = checkInput
        )
    }
}