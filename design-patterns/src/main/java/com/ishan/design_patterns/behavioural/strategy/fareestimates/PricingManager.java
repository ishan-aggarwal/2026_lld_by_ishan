package com.ishan.design_patterns.behavioural.strategy.fareestimates;

public class PricingManager {

    public static final double BASE_FARE = 5.0;

    private final PricingStrategy pricingStrategy;

    public PricingManager(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        return pricingStrategy.calculatePrice(rideDetails);
    }
}
