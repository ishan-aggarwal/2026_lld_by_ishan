package com.ishan.design_patterns.structural.proxy.doc_example;

public class DocumentProxy implements Document {

    private RealDocument realDocument;
    private final String userRole;

    public DocumentProxy(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void read() {
        // controlled access
        if (!"ADMIN".equals(userRole)) {
            throw new RuntimeException("Access denied: insufficient permissions");
        }

        if (realDocument == null) {
            realDocument = new RealDocument(); // lazy initialization
        }

        realDocument.read();
    }
}
