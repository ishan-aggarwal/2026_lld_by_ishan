package com.ishan.design_patterns.behavioural.command.remoteexample.compliant;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
