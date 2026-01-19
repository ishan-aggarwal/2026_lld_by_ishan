package com.ishan.design_patterns.creational.prototype.usecase.configuration;

/**
 * Client demonstrating Prototype Design Pattern with Configuration use case.
 */
public class ConfigurationPrototypeClient {

    public static void main(String[] args) {

        // Step 1: Create registry
        ConfigurationPrototypeRegistry registry =
                new ConfigurationPrototypeRegistryImpl();

        // Step 2: Create base configuration prototypes
        Configuration basicConfig = new Configuration(
                "Blue",
                true,
                "en",
                false,
                14,
                "Arial",
                ConfigurationType.BASIC
        );

        Configuration advancedConfig = new Configuration(
                "Green",
                true,
                "en",
                true,
                16,
                "Roboto",
                ConfigurationType.ADVANCED
        );

        Configuration defaultConfig = new Configuration(
                "Gray",
                false,
                "en",
                false,
                12,
                "System",
                ConfigurationType.DEFAULT
        );

        // Step 3: Register prototypes
        registry.register(basicConfig);
        registry.register(advancedConfig);
        registry.register(defaultConfig);

        // Step 4: Clone configurations
        Configuration config1 = registry.clone(ConfigurationType.BASIC);
        Configuration config2 = registry.clone(ConfigurationType.BASIC);

        // Step 5: Validate cloning
        System.out.println("config1 == config2 : " + (config1 == config2)); // false
        System.out.println("config1 theme      : " + config1.getThemeColor());
        System.out.println("config2 font       : " + config2.getFontFamily());
    }
}
