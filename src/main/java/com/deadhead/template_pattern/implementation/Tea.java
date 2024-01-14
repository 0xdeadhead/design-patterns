package com.deadhead.template_pattern.implementation;

import com.deadhead.template_pattern.specification.HotBeverage;

public class Tea extends HotBeverage {

    @Override
    public void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    public void addCondiment() {
        System.out.println("Adding lemon");
    }

}
