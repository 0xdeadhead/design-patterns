package com.deadhead;

import com.deadhead.strategy_pattern.implementations.DumbQuackableImpl;
import com.deadhead.strategy_pattern.implementations.DuckImpl;
import com.deadhead.strategy_pattern.implementations.NormalFlyableImpl;
import com.deadhead.strategy_pattern.implementations.NormalQuakableImpl;
import com.deadhead.strategy_pattern.implementations.RocketFlyableImpl;
import com.deadhead.strategy_pattern.specifications.Duck;
import com.deadhead.strategy_pattern.specifications.Flyable;
import com.deadhead.strategy_pattern.specifications.Quackable;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Strategy pattern Start");

        Flyable flyable = new NormalFlyableImpl();
        Quackable quackable = new NormalQuakableImpl();
        Duck extensibleDuck = new DuckImpl();
        extensibleDuck.setFlyable(flyable);
        extensibleDuck.setQuackable(quackable);
        extensibleDuck.fly();
        extensibleDuck.quack();
        extensibleDuck.setQuackable(new DumbQuackableImpl());
        extensibleDuck.setFlyable(new RocketFlyableImpl());
        extensibleDuck.fly();
        extensibleDuck.quack();
        System.out.println("Strategy pattern End");

    }
}
