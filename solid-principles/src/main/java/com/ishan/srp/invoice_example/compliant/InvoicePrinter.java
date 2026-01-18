package com.ishan.srp.invoice_example.compliant;

public class InvoicePrinter {

    private final Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print() {
        System.out.println("Total price is : " + invoice.totalPrice());
    }
}
