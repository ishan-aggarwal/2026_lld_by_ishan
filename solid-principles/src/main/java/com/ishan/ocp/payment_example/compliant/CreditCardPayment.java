package com.ishan.ocp.payment_example.compliant;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void process(double amount) {
        // credit card logic
        System.out.println("Credit Card Payment for amount " + amount);
    }
}
