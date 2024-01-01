package com.deadhead.decorator_pattern.implementation.beverages;

import com.deadhead.decorator_pattern.specifications.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super();
        this.description = ", DarkRoast";
    }

    @Override
    public double getCost() {
        return 2.55;
    }

}
