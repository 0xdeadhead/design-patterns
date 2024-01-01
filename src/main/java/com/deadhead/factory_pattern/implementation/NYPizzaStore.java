package com.deadhead.factory_pattern.implementation;

import com.deadhead.factory_pattern.specifications.Pizza;
import com.deadhead.factory_pattern.specifications.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        }
        return null;
    }

}
