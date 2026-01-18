package com.ishan.lsp.bird_example.violated;

public class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }
}