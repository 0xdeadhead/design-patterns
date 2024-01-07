package com.deadhead.command_pattern.implementation;

import com.deadhead.command_pattern.specifications.Command;

public class LightOnCommand implements Command {
    private Light light;

    @Override
    public void execute() {
        light.turnOnLight();
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }

}
