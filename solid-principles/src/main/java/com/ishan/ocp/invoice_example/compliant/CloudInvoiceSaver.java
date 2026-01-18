package com.ishan.ocp.invoice_example.compliant;

public class CloudInvoiceSaver implements InvoiceSaver {

    @Override
    public void saveInvoice(Invoice invoice) {
        System.out.println("Saving invoice to cloud: " + invoice.totalPrice());
    }
}
