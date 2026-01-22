package com.ishan.design_patterns.behavioural.strategy.fareestimates;

import static com.ishan.design_patterns.behavioural.strategy.fareestimates.PricingManager.BASE_FARE;

public class TimeBasedPricingStrategy implements PricingStrategy {

    private static final double PER_MINUTE_RATE = 0.5;

    @Override
    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return BASE_FARE + PER_MINUTE_RATE * rideDetails.getDuration();
    }
}
