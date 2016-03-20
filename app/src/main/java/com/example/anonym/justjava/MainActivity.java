package com.example.anonym.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayQuantity(quantity);
        String orderSummary = createOrderSummary();
        displayMessage(orderSummary);
        //Coba commit
    }

    /**
     * method for order summary
     * @return order summary
     */

    public String createOrderSummary(){
        int priceValue;
        priceValue = calculatePrice();
        String price = "Name: Doddy Zaki";
        price = price + "\nQuantity: " + quantity;
        price = price + "\nTotal: $" + priceValue;
        price = price + "\nThank You!";
        return price;
    }

    /**
     *
     * method for Calculate Price
     * @return price
     */
    private int calculatePrice(){
        int price = quantity * 5;
        return price;
    }


    /**
     * This method is called when the increment button is clicked.
     */
    public void incrementOrder(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the increment button is clicked.
     */
    public void decrementOrder(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfOrder) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfOrder);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayMessage(String a) {

        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        //orderSummaryTextView.setText(NumberFormat.getCurrencyInstance().format(number));
        orderSummaryTextView.setText(a);
    }
}