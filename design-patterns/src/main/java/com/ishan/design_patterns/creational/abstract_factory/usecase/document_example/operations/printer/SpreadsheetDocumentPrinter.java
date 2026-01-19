package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.printer;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}