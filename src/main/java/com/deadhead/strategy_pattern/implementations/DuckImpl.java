package com.deadhead.strategy_pattern.implementations;

import com.deadhead.strategy_pattern.specifications.Duck;
import com.deadhead.strategy_pattern.specifications.Flyable;
import com.deadhead.strategy_pattern.specifications.Quackable;

public class DuckImpl extends Duck {

    private Flyable flyable;
    private Quackable quackable;

    public void fly() {
        flyable.fly();

    }

    public void quack() {
        quackable.quack();
    }

    @Override
    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    @Override
    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

}
