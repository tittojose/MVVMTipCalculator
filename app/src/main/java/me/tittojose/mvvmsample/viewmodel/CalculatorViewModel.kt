package me.tittojose.mvvmsample.viewmodel

import me.tittojose.mvvmsample.model.RestaurantCalculator
import me.tittojose.mvvmsample.model.TipCalculation

/**
 * Created by Jose.
 */

class CalculatorViewModel(val calculator: RestaurantCalculator = RestaurantCalculator()) {

    var inputCheckamount = ""
    var inputTipPercent = ""

    var tipCalculation = TipCalculation()

    fun calculateTip() {
        val checkAmount = inputCheckamount.toDoubleOrNull()
        val tipPercent = inputTipPercent.toIntOrNull()

        if (tipPercent != null && checkAmount != null) {
            tipCalculation = calculator.calculateTip(checkAmount, tipPercent)
        }
    }

}
