package com.ishan.design_patterns.structural.proxy.doc_example;

public class ProxyPatternClient {

    public static void main(String[] args) {
        Document document = new DocumentProxy("ADMIN");
        document.read();
    }
}
