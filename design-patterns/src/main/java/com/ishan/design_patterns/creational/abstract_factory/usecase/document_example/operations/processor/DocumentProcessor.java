package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}