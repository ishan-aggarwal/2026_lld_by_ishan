package com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.factory;

import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.dishtv.DishTV;
import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.sim.Sim;
import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.wifi.Wifi;

public abstract class ProductFactory {
    public abstract Sim createSim();

    public abstract Wifi createWifi();

    public abstract DishTV createDishTV();
}
