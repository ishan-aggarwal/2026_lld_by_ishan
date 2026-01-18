package com.ishan.ocp.payment_example.violated;

public class PaymentProcessor {
    public void process(String type, double amount) {
        if (type.equals("credit")) {
            // credit card logic
        } else if (type.equals("paypal")) {
            // paypal logic
        }
        // Adding crypto means modifying this method
    }
}

