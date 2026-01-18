package com.ishan.lsp.bird_example.compliant;

public class Eagle extends Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }
}
