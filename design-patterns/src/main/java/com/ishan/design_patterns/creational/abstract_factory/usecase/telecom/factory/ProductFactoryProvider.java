package com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.factory;

import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.model.ProviderType;

public class ProductFactoryProvider {

    public static ProductFactory getFactory(ProviderType providerType) {

        return switch (providerType) {
            case AIRTEL -> new AirtelProductFactory();
            case JIO -> new RelianceProductFactory();
        };
    }
}
