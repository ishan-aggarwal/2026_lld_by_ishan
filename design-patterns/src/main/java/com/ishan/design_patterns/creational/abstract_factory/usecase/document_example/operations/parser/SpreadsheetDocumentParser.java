package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.parser;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}