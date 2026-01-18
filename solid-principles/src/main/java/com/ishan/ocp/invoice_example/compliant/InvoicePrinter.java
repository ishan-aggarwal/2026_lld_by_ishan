package com.ishan.ocp.invoice_example.compliant;

public class InvoicePrinter {

    private final Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Total price is : " + invoice.totalPrice());
    }
}
