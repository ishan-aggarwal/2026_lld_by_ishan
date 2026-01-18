package com.ishan.ocp.payment_example.compliant;

public class PaymentClient {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCard = new CreditCardPayment();
        processor.process(creditCard, 1000.0);

        PaymentMethod paypal = new PayPalPayment();
        processor.process(paypal, 750.0);

        PaymentMethod crypto = new CryptoPayment();
        processor.process(crypto, 0.05);
    }
}
