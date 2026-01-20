package com.ishan.design_patterns.structural.proxy.doc_example;

public class RealDocument implements Document {
    @Override
    public void read() {
        System.out.println("Reading confidential document...");
    }
}
