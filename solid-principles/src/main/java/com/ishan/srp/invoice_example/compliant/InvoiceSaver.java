package com.ishan.srp.invoice_example.compliant;

public class InvoiceSaver {

    private final Invoice invoice;

    public InvoiceSaver(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDb() {
        System.out.println("Saving invoice to DB: " + invoice.totalPrice());
    }
}
