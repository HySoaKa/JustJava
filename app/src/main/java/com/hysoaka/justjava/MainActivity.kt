package com.hysoaka.justjava

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var numberOfCoffees = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * This method is called when the order button is clicked
     */
    fun submitOrder(view: View) {
        displayMessage("Total: $$numberOfCoffees\nThank you!")
    }

    /**
     * This method is called when the increment button is clicked
     */
    fun increment(view: View) {
        numberOfCoffees++
        display(numberOfCoffees)
    }

    /**
     * This method is called when the decrement button is clicked
     */
    fun decrement(view: View) {
        if (numberOfCoffees > 0) numberOfCoffees--
        display(numberOfCoffees)
    }

    /**
     * This method displays the given quantity value on the screen
     */
    private fun display(number: Int) {
        quantity_text_view.text = "$number"
    }

    /**
     * This method displays the given quantity value on the screen
     */
//    private fun displayPrice(number: Int) {
//        price_text_view.text = NumberFormat.getCurrencyInstance().format(number)
//    }

    /**
     * This method displays the given text on the screen
     */
    private fun displayMessage(message: String) {
        price_text_view.text = message
    }

}

