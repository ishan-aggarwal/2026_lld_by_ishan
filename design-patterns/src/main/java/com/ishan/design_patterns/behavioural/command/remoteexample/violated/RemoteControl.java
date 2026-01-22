package com.ishan.design_patterns.behavioural.command.remoteexample.violated;

public class RemoteControl {

    public void pressButton(String action) {
        if ("ON".equals(action)) {
            new Light().turnOn();
        } else if ("OFF".equals(action)) {
            new Light().turnOff();
        }
    }
}
