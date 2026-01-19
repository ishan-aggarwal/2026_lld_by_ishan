package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.factory;


import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.parser.DocumentParser;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.printer.DocumentPrinter;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentProcessor createProcessor(String documentName);

    public abstract DocumentParser createParser(String path);

    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);

    public abstract DocumentType supportsType();
}