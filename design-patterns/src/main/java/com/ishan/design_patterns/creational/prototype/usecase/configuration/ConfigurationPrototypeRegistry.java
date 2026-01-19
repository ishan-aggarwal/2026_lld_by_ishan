package com.ishan.design_patterns.creational.prototype.usecase.configuration;

/**
 * Registry for managing Configuration prototypes.
 */
public interface ConfigurationPrototypeRegistry {

    /**
     * Registers a base prototype.
     */
    void register(Configuration configuration);

    /**
     * Returns a cloned configuration for the given type.
     */
    Configuration clone(ConfigurationType type);
}
