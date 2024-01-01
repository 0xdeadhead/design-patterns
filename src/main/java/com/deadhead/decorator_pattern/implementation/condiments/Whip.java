package com.deadhead.decorator_pattern.implementation.condiments;

import com.deadhead.decorator_pattern.specifications.Beverage;
import com.deadhead.decorator_pattern.specifications.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        super();
        super.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return super.beverage.getDescription() + " , Whip";
    }

    @Override
    public double getCost() {
        return super.beverage.getCost() + 0.89;
    }

}
