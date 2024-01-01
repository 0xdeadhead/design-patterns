package com.deadhead.factory_pattern.implementation;

import java.util.ArrayList;
import java.util.List;

import com.deadhead.factory_pattern.specifications.Pizza;

public class ChicagoChickenPizza extends Pizza {

    public ChicagoChickenPizza() {
        super();
        super.description = "Chicago chicken Pizza";
        List<String> toppings = new ArrayList<>();
        toppings.add("chicken");
        toppings.add("pepper");
        super.setToppings(toppings);
    }

    @Override
    public void cut() {
        System.out.println("Cutting diagonally  ");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza at extreme hot for 15");
    }

    @Override
    public void pack() {
        System.out.println("Packing pizza in circular box ");
    }

}
