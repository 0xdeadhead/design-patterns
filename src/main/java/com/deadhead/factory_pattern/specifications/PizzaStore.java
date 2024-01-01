package com.deadhead.factory_pattern.specifications;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.pack();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
