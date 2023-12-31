package com.deadhead;

import com.deadhead.strategy_pattern.implementations.DumbQuackableImpl;
import com.deadhead.observer_pattern.implementation.StatsDisplay;
import com.deadhead.observer_pattern.implementation.WeatherData;
import com.deadhead.strategy_pattern.implementations.DuckImpl;
import com.deadhead.strategy_pattern.implementations.NormalFlyableImpl;
import com.deadhead.strategy_pattern.implementations.NormalQuakableImpl;
import com.deadhead.strategy_pattern.implementations.RocketFlyableImpl;
import com.deadhead.strategy_pattern.specifications.Duck;
import com.deadhead.strategy_pattern.specifications.Flyable;
import com.deadhead.strategy_pattern.specifications.Quackable;


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

        System.out.println("Observer pattern Start");

        WeatherData weatherData = new WeatherData();
        StatsDisplay statsDisplay1 = new StatsDisplay("display1");
        StatsDisplay statsDisplay2 = new StatsDisplay("display2");
        weatherData.registerObserver(statsDisplay1);
        weatherData.setAirPressure(2.55D);
        weatherData.setTemperature(45.55D);
        weatherData.registerObserver(statsDisplay2);
        weatherData.removeObserver(statsDisplay1);
        weatherData.setHumidity(2.88D);

        System.out.println("Observer pattern End");

    }
}
