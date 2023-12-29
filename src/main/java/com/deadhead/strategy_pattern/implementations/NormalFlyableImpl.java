package com.deadhead.strategy_pattern.implementations;

import com.deadhead.strategy_pattern.specifications.Flyable;

public class NormalFlyableImpl implements Flyable {

    @Override
    public void fly() {
        System.out.println("Flying normally");
    }

}
