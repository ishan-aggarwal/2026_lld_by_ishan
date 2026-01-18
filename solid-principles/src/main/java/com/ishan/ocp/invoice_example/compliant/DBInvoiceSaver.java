package com.ishan.ocp.invoice_example.compliant;

public class DBInvoiceSaver implements InvoiceSaver {

    @Override
    public void saveInvoice(Invoice invoice) {
        System.out.println("Saving invoice to DB: " + invoice.totalPrice());
    }
}
