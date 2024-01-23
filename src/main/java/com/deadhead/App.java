package com.deadhead;

import com.deadhead.strategy_pattern.implementations.DumbQuackableImpl;
import com.deadhead.adapter_pattern.implementation.DuckAdapter;
import com.deadhead.adapter_pattern.implementation.WildTurkey;
import com.deadhead.adapter_pattern.specifications.Turkey;
import com.deadhead.command_pattern.implementation.Light;
import com.deadhead.command_pattern.implementation.LightOffCommand;
import com.deadhead.command_pattern.implementation.LightOnCommand;
import com.deadhead.command_pattern.implementation.RemoteControl;
import com.deadhead.command_pattern.specifications.Command;
import com.deadhead.composite_pattern.implementation.SubMenu;
import com.deadhead.composite_pattern.implementation.SubMenuItem;
import com.deadhead.composite_pattern.specifications.MenuComponent;
import com.deadhead.decorator_pattern.implementation.beverages.Espresso;
import com.deadhead.decorator_pattern.implementation.condiments.Milk;
import com.deadhead.decorator_pattern.implementation.condiments.Whip;
import com.deadhead.decorator_pattern.specifications.Beverage;
import com.deadhead.factory_pattern.implementation.ChicagoPizzaStore;
import com.deadhead.factory_pattern.implementation.NYPizzaStore;
import com.deadhead.factory_pattern.specifications.Pizza;
import com.deadhead.factory_pattern.specifications.PizzaStore;
import com.deadhead.iterator_pattern.implementation.BreakFastMenu;
import com.deadhead.iterator_pattern.implementation.DinnerMenu;
import com.deadhead.iterator_pattern.specifications.Iterator;
import com.deadhead.iterator_pattern.specifications.Menu;
import com.deadhead.iterator_pattern.specifications.MenuItem;
import com.deadhead.observer_pattern.implementation.StatsDisplay;
import com.deadhead.observer_pattern.implementation.WeatherData;
import com.deadhead.singleton_pattern.Configuration;
import com.deadhead.strategy_pattern.implementations.DuckImpl;
import com.deadhead.strategy_pattern.implementations.NormalFlyableImpl;
import com.deadhead.strategy_pattern.implementations.NormalQuakableImpl;
import com.deadhead.strategy_pattern.implementations.RocketFlyableImpl;
import com.deadhead.strategy_pattern.specifications.Duck;
import com.deadhead.strategy_pattern.specifications.Flyable;
import com.deadhead.strategy_pattern.specifications.Quackable;
import com.deadhead.template_pattern.implementation.Coffee;
import com.deadhead.template_pattern.implementation.Tea;
import com.deadhead.template_pattern.specification.HotBeverage;

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

        System.out.println("Singleton Pattern");
        Configuration config1 = Configuration.getInstance("test1");
        // unchanged
        Configuration config2 = Configuration.getInstance("test2");
        System.out.println(config1.getConfigurationParam());
        System.out.println(config2.getConfigurationParam());
        System.out.println(config1 == config2);
        System.out.println("Singleton Pattern End");

        System.out.println("Command Pattern");
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl(lightOnCommand, lightOffCommand);
        remoteControl.turnOnLight();
        remoteControl.turnOffLight();
        System.out.println("Command Pattern End");
        System.out.println("Adapter Pattern Start");
        Turkey wildTurkey = new WildTurkey();
        com.deadhead.adapter_pattern.specifications.Duck duck = new DuckAdapter(wildTurkey);
        duck.quack();
        duck.fly();
        System.out.println("Adapter Pattern End");
        System.out.println("Template Pattern Start");
        HotBeverage tea = new Tea();
        tea.prepareRecipe();
        HotBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("Template Pattern End");
        System.out.println("Iterator Pattern Start");
        // hides internal implementation of menu
        Menu dinnerMenu = new DinnerMenu();
        Iterator<MenuItem> dinnerMenuIterator = dinnerMenu.getIterator();
        Menu breakFastMenu = new BreakFastMenu();
        Iterator<MenuItem> breakFastMenuIterator = breakFastMenu.getIterator();
        while (dinnerMenuIterator.hasNext()) {
            MenuItem dinnerMenuItem = dinnerMenuIterator.next();
            System.out.println(dinnerMenuItem);
        }
        while (breakFastMenuIterator.hasNext()) {
            MenuItem breakFastMenuItem = breakFastMenuIterator.next();
            System.out.println(breakFastMenuItem);
        }
        System.out.println("Iterator Pattern End");
        System.out.println("Composite Pattern Start");
        MenuComponent pancakeHouseMenu = new SubMenu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new SubMenu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new SubMenu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new SubMenu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new SubMenu("ALL MENUS", "All menus combined");
        allMenus.addComponent(pancakeHouseMenu);
        allMenus.addComponent(dinerMenu);
        allMenus.addComponent(cafeMenu);
        dinerMenu.addComponent(new SubMenuItem("Pizza", "pizzaaaaaa", 180.25d));
        dessertMenu.addComponent(new SubMenuItem("Gulab Jamun", "Gulaab Jamun description", 80.22d));
        dinerMenu.addComponent(dessertMenu);
        allMenus.print();
        System.out.println("Composite Pattern End");
    }
}
