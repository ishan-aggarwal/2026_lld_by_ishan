package com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.factory;

import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.dishtv.*;
import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.sim.*;
import com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.wifi.*;

public class RelianceProductFactory extends ProductFactory {

    @Override
    public Sim createSim() {
        return new JioSim();
    }

    @Override
    public Wifi createWifi() {
        return new JioWifi();
    }

    @Override
    public DishTV createDishTV() {
        return new JioDishTV();
    }
}
