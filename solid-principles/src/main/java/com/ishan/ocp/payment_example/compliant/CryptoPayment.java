package com.ishan.ocp.payment_example.compliant;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void process(double amount) {
        // crypto logic
        System.out.println("Crypto Payment for amount " + amount);
    }
}
