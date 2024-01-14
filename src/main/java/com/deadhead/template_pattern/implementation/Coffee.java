package com.deadhead.template_pattern.implementation;

import com.deadhead.template_pattern.specification.HotBeverage;

public class Coffee extends HotBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding sugar and milk");
    }

}
