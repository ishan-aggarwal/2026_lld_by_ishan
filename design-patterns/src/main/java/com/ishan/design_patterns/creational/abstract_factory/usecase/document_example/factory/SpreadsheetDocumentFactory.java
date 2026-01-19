package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.factory;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.parser.DocumentParser;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.parser.SpreadsheetDocumentParser;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.printer.DocumentPrinter;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.printer.SpreadsheetDocumentPrinter;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor.DocumentProcessor;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentProcessor createProcessor(String name) {
        return new SpreadsheetDocumentProcessor(name);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor documentProcessor) {
        return new SpreadsheetDocumentPrinter(documentProcessor);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}