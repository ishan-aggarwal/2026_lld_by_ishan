package com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.factory;

import com.ishan.design_patterns.creational.abstract_factory.usecase.document_example.model.DocumentType;

import java.util.EnumMap;
import java.util.Map;

public final class DocumentFactoryProvider {

    private static final Map<DocumentType, DocumentFactory> FACTORIES =
            new EnumMap<>(DocumentType.class);

    static {
        FACTORIES.put(DocumentType.TEXT, new TextDocumentFactory());
        FACTORIES.put(DocumentType.SPREAD_SHEET, new SpreadsheetDocumentFactory());
    }

    private DocumentFactoryProvider() {
        // prevent instantiation
    }

    public static DocumentFactory getFactory(DocumentType type) {
        DocumentFactory factory = FACTORIES.get(type);
        if (factory == null) {
            throw new IllegalArgumentException(
                "No DocumentFactory found for type: " + type
            );
        }
        return factory;
    }
}
