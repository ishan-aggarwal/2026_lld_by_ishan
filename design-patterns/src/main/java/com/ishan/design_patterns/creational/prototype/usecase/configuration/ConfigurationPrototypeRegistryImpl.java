package com.ishan.design_patterns.creational.prototype.usecase.configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Concrete Prototype Registry implementation.
 */
public class ConfigurationPrototypeRegistryImpl
        implements ConfigurationPrototypeRegistry {

    private final Map<ConfigurationType, Configuration> prototypes = new HashMap<>();

    @Override
    public void register(Configuration configuration) {
        if (configuration == null || configuration.getType() == null) {
            throw new IllegalArgumentException("Configuration and type must not be null");
        }
        prototypes.put(configuration.getType(), configuration);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        Configuration prototype = prototypes.get(type);

        if (prototype == null) {
            throw new IllegalArgumentException(
                    "No configuration prototype registered for type: " + type
            );
        }

        return prototype.copy();
    }
}
