package com.ishan.design_patterns.behavioural.observer.weather_example.services;

import com.ishan.design_patterns.behavioural.observer.weather_example.Observer;
import com.ishan.design_patterns.behavioural.observer.weather_example.utils.NotificationUtils;

public class HumidityService implements Observer {
    @Override
    public void notifyObserver(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}