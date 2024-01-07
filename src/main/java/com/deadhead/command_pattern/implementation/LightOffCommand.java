package com.deadhead.command_pattern.implementation;

import com.deadhead.command_pattern.specifications.Command;

public class LightOffCommand implements Command {
    private Light light;

    @Override
    public void execute() {

        light.turnOffLight();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }

}
