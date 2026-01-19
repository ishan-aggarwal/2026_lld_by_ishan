package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;

public class TextDocumentProcessor extends DocumentProcessor {

    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public void processDocument() {
        // Implement text document processing logic
        System.out.println("Processing a text document: " + getDocumentName());
        // Additional logic for text document processing
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}