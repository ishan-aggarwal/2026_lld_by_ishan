package com.ishan.lsp.bird_example.violated;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }

    @Override
    public void eat() {
        System.out.println("Penguin is eating");
    }
}