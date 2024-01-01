package com.deadhead.factory_pattern.implementation;

import com.deadhead.factory_pattern.specifications.Pizza;
import com.deadhead.factory_pattern.specifications.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("chicken")) {
            return new ChicagoChickenPizza();
        }
        return null;
    }

}
