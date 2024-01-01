package com.deadhead;

import com.deadhead.strategy_pattern.implementations.DumbQuackableImpl;
import com.deadhead.decorator_pattern.implementation.beverages.Espresso;
import com.deadhead.decorator_pattern.implementation.condiments.Milk;
import com.deadhead.decorator_pattern.implementation.condiments.Whip;
import com.deadhead.decorator_pattern.specifications.Beverage;
import com.deadhead.decorator_pattern.specifications.CondimentDecorator;
import com.deadhead.factory_pattern.implementation.ChicagoPizzaStore;
import com.deadhead.factory_pattern.implementation.NYPizzaStore;
import com.deadhead.factory_pattern.specifications.Pizza;
import com.deadhead.factory_pattern.specifications.PizzaStore;
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

        System.out.println("Decorator Pattern in Action");
        Beverage espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() + ":" + espresso.getCost());

        System.out.println("Decorator Pattern End");

        System.out.println("Factory Pattern in Action");
        PizzaStore newyorkPizzaStore = new NYPizzaStore();
        Pizza nyPizza = newyorkPizzaStore.orderPizza("cheese");
        System.out.println(nyPizza);
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chickenPizza = chicagoPizzaStore.orderPizza("chicken");
        System.out.println(chickenPizza);

        System.out.println("Factory Pattern End");

    }
}
