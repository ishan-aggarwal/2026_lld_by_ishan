package com.ishan.ocp.invoice_example.compliant;

public class InvoiceClient {

    public static void main(String[] args) {

        Product product = new Product("Laptop", 50000);
        Invoice invoice = new Invoice(product, 2);

        // Print invoice
        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.printInvoice();

        // Save invoice (choose implementation)
        InvoiceSaver dbSaver = new DBInvoiceSaver();
        dbSaver.saveInvoice(invoice);

        InvoiceSaver fileSaver = new FileInvoiceSaver();
        fileSaver.saveInvoice(invoice);
    }
}
