package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.factory;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.parser.DocumentParser;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.parser.TextDocumentParser;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.printer.DocumentPrinter;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.printer.TextDocumentPrinter;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor.DocumentProcessor;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {

    @Override
    public DocumentProcessor createProcessor(String name) {
        return new TextDocumentProcessor(name);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor documentProcessor) {
        return new TextDocumentPrinter(documentProcessor);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}