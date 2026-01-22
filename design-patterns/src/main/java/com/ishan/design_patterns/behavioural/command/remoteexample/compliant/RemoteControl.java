package com.ishan.design_patterns.behavioural.command.remoteexample.compliant;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
