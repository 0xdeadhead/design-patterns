package com.deadhead.command_pattern.implementation;

import com.deadhead.command_pattern.specifications.Command;

public class RemoteControl {

    private Command lightOnCommand;
    private Command lightOffCommand;

    public RemoteControl(Command lightOnCommand, Command lightOffCommand) {
        this.lightOnCommand = lightOnCommand;
        this.lightOffCommand = lightOffCommand;
    }

    public void turnOnLight() {
        this.lightOnCommand.execute();
    }

    public void turnOffLight() {
        this.lightOffCommand.execute();
    }

}
