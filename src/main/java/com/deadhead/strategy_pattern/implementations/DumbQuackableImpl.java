package com.deadhead.strategy_pattern.implementations;

import com.deadhead.strategy_pattern.specifications.Quackable;

public class DumbQuackableImpl implements Quackable {

    @Override
    public void quack() {
        System.out.println("Unable to Quack");
    }

}
