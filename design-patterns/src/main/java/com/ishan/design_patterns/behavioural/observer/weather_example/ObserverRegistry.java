package com.ishan.design_patterns.behavioural.observer.weather_example;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(double value);
}