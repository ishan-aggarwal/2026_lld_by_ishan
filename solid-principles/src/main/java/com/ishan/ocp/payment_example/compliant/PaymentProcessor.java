package com.ishan.ocp.payment_example.compliant;

public class PaymentProcessor {

    public void process(PaymentMethod method, double amount) {
        method.process(amount);
    }
}
