package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.printer;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor.DocumentProcessor;


public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
        System.out.println("Printing text document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}