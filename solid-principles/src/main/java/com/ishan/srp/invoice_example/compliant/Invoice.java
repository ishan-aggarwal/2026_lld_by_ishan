package com.ishan.srp.invoice_example.compliant;

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
}
