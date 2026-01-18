package com.ishan.ocp.payment_example.compliant;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void process(double amount) {
        // paypal logic
        System.out.println("PayPal Payment for amount " + amount);
    }
}
