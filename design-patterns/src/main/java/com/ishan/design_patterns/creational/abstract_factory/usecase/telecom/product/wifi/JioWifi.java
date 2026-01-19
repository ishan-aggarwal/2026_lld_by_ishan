package com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.wifi;

public class JioWifi extends Wifi {

    @Override
    public void connect() {
        System.out.println("Connecting to Jio WiFi");
    }
}
