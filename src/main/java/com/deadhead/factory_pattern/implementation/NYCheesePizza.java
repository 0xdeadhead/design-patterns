package com.deadhead.factory_pattern.implementation;

import java.util.ArrayList;
import java.util.List;

import com.deadhead.factory_pattern.specifications.Pizza;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        super();
        super.description = "NY Cheese Pizza";
        List<String> toppings = new ArrayList<>();
        toppings.add("pepper");
        toppings.add("pineapple");
        super.setToppings(toppings);
    }

    @Override
    public void cut() {
        System.out.println("Not cutting pizza ");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza at medium/hot for 20");
    }

    @Override
    public void pack() {
        System.out.println("Packing pizza in square box ");
    }

}
