package nsu.edu.cn.justjava.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import nsu.edu.cn.justjava.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        int price = calculatePrice();
        String priceMessage = creatOrderSummary(price);
        displayMessage(priceMessage);

    }

    private String creatOrderSummary(int price){
       String priceMessage = "Name: Kaptain Kunal";
        priceMessage = priceMessage + "\nQuantity: " + quantity;
        priceMessage = priceMessage + "\nTotal: $" + price;
        priceMessage = priceMessage + "\nThank you!";
        return priceMessage;
    }

    private int calculatePrice(){
        return quantity * 5;

    }


    int quantity = 0;

    public void zengJia(View view) {

        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void jianShao(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }



    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextview = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextview.setText("" + numberOfCoffees);
    }

    private void displayMessage(String message) {
        TextView priceTextview = (TextView) findViewById(R.id.price_text_view);
        priceTextview.setText(message);
    }
}
