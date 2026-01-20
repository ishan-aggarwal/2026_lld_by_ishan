package com.ishan.design_patterns.structural.facade.booking_example.services;


import com.ishan.design_patterns.structural.facade.booking_example.models.PaymentStatus;

public class PaymentService {

    public PaymentStatus makePayment(String userId, String accommodationId) {
        // Logic to process payment
        return PaymentStatus.SUCCESS; // Placeholder
    }

    public double calculatePaymentAmount(String accommodationId) {
        // Logic to calculate payment amount
        return 0.0; // Placeholder
    }
}