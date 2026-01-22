package com.ishan.design_patterns.behavioural.command.remoteexample.compliant;

public class CommandDemo {
    public static void main(String[] args) {

        Light light = new Light();

        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(onCommand);
        remote.pressButton();

        remote.setCommand(offCommand);
        remote.pressButton();
    }
}

/**
 * Why this works
 * <p>
 * Invoker (RemoteControl) knows nothing about Light
 * New actions = new Command classes (Open/Closed Principle)
 * Easy to add undo, macro commands, queues, logs
 * <p>
 * Simple Mental Model
 * Button → Command → Receiver
 */