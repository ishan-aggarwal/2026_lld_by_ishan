package com.ishan.design_patterns.behavioural.strategy.fareestimates;

public class StrategyPatternDemo {

    public static void main(String[] args) {

        RideDetails ride = new RideDetails(10, 20);

        PricingManager distancePricing =
                new PricingManager(new DistanceBasedPricingStrategy());
        System.out.println("Distance Based Fare: " +
                distancePricing.calculatePrice(ride));

        PricingManager timePricing =
                new PricingManager(new TimeBasedPricingStrategy());
        System.out.println("Time Based Fare: " +
                timePricing.calculatePrice(ride));

        PricingManager surgePricing =
                new PricingManager(new SurgePricingStrategy());
        System.out.println("Surge Fare: " +
                surgePricing.calculatePrice(ride));
    }
}
