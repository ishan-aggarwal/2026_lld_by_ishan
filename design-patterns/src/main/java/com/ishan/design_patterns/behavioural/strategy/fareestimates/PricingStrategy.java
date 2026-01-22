package com.ishan.design_patterns.behavioural.strategy.fareestimates;

public interface PricingStrategy {

    PricingType supportsType();

    Double calculatePrice(RideDetails rideDetails);
}
