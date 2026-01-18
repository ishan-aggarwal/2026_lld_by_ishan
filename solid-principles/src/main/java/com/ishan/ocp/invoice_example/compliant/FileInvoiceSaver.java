package com.ishan.ocp.invoice_example.compliant;

public class FileInvoiceSaver implements InvoiceSaver {

    @Override
    public void saveInvoice(Invoice invoice) {
        System.out.println("Saving invoice to file: " + invoice.totalPrice());
    }
}
