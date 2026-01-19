package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.parser;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse text document
        System.out.println("Parse text document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
