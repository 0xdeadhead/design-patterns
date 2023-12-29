package com.deadhead.strategy_pattern.specifications;

public abstract class Duck {
    public abstract void setFlyable(Flyable flyable);

    public abstract void setQuackable(Quackable quackable);

    public abstract void fly();

    public abstract void quack();
}
