package com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.client;

import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.factory.ProductFactory;
import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.factory.ProductFactoryProvider;
import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.model.ProviderType;
import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.dishtv.DishTV;
import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.sim.Sim;
import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.wifi.Wifi;

public class TelecomClient {

    public static void main(String[] args) {

        ProductFactory factory =
                ProductFactoryProvider.getFactory(ProviderType.AIRTEL);

        Sim sim = factory.createSim();
        Wifi wifi = factory.createWifi();
        DishTV dishTV = factory.createDishTV();

        sim.call();
        wifi.connect();
        dishTV.watch();
    }
}
