package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.parser;


import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;

public abstract class DocumentParser {

    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();

}