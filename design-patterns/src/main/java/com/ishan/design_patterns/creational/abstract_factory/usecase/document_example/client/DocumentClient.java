package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.client;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.factory.DocumentFactory;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.factory.DocumentFactoryProvider;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.parser.DocumentParser;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.printer.DocumentPrinter;
import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.operations.processor.DocumentProcessor;

public class DocumentClient {

    public static void main(String[] args) {

        DocumentType documentType = DocumentType.TEXT;

        DocumentFactory factory =
                DocumentFactoryProvider.getFactory(documentType);

        DocumentProcessor processor =
                factory.createProcessor("sample-document");

        DocumentParser parser =
                factory.createParser("/docs/sample.txt");

        DocumentPrinter printer =
                factory.createPrinter(processor);

        parser.parseDocument();
        processor.processDocument();
        printer.printDocument();
    }
}
