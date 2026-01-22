package com.ishan.design_patterns.behavioural.strategy.fareestimates;


import static com.ishan.design_patterns.behavioural.strategy.fareestimates.PricingManager.BASE_FARE;

public class SurgePricingStrategy implements PricingStrategy {

    private static final double SURGE_MULTIPLIER = 2.0;

    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE * SURGE_MULTIPLIER;
    }
}
