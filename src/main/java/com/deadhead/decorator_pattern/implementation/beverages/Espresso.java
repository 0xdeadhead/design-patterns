package com.deadhead.decorator_pattern.implementation.beverages;

import com.deadhead.decorator_pattern.specifications.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        super();
        this.description = " , Espresso";
    }

    @Override
    public double getCost() {
        return 1.99;
    }

}
