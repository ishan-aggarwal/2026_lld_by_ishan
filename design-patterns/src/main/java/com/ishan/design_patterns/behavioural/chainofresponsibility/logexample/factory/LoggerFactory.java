package com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.factory;

import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.logger.*;
import com.ishan.design_patterns.behavioural.chainofresponsibility.logexample.model.LogLevel;

public class LoggerFactory {

    private static final Logger debugLogger = new DebugLogger();
    private static final Logger infoLogger = new InfoLogger();
    private static final Logger errorLogger = new ErrorLogger();

    static {
        // Build chain: DEBUG → INFO → ERROR
        debugLogger.setNext(infoLogger);
        infoLogger.setNext(errorLogger);
    }

    public static Logger getLogger(LogLevel configuredLevel) {
        // Decide entry point based on configuration
        switch (configuredLevel) {
            case DEBUG:
                return debugLogger;
            case INFO:
                return infoLogger;
            case ERROR:
                return errorLogger;
            default:
                throw new IllegalArgumentException("Unsupported log level");
        }
    }
}
