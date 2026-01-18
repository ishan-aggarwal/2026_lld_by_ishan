package com.ishan.ocp.invoice_example.violated;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
