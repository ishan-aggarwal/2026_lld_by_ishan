package com.ishan.design_patterns.creational.abstract_factory.usecase.telecom.product.sim;

public class AirtelSim extends Sim {

    @Override
    public void call() {
        System.out.println("Calling using Airtel SIM");
    }
}
