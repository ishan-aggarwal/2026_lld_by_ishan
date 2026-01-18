package com.ishan.srp.invoice_example.violated;

import lombok.Data;

@Data
public class Invoice {
    private Product product;
    private int quantity;

    public Invoice(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int totalPrice() {
        return product.getPrice() * quantity;
    }

    public void printInvoice() {
        System.out.println("Total price is : " + totalPrice());
    }

    public void saveInvoice() {
        System.out.println("Saving invoice to DB: " + totalPrice());
    }
}
