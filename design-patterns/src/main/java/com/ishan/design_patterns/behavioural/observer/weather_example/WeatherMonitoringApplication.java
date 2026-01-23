package com.ishan.design_patterns.behavioural.observer.weather_example;

public class WeatherMonitoringApplication extends Publisher {

    private double temperature;
    private double humidity;
    private double pressure;
    private final double temperatureThreshold;
    private final double humidityThreshold;
    private final double pressureThreshold;

    // DO NOT MODIFY THIS CONSTRUCTOR
    public WeatherMonitoringApplication(double initialTemperature, double initialHumidity, double initialPressure,
                                        double temperatureThreshold, double humidityThreshold, double pressureThreshold) {
        this.temperature = initialTemperature;
        this.humidity = initialHumidity;
        this.pressure = initialPressure;
        this.temperatureThreshold = temperatureThreshold;
        this.humidityThreshold = humidityThreshold;
        this.pressureThreshold = pressureThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

    public void updateWeatherConditions(double newTemperature, double newHumidity, double newPressure) {
        temperature = newTemperature;
        humidity = newHumidity;
        pressure = newPressure;

        if (temperature > temperatureThreshold) {
            notifyObservers(temperature);
        }

        if (humidity > humidityThreshold) {
            notifyObservers(humidity);
        }

        if (pressure > pressureThreshold) {
            notifyObservers(pressure);
        }
    }
}