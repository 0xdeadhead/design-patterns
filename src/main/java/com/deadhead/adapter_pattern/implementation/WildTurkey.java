package com.deadhead.adapter_pattern.implementation;

import com.deadhead.adapter_pattern.specifications.Turkey;

public class WildTurkey implements Turkey {

    @Override
    public void bobble() {
        System.out.println("Turkey Bobble");
    }

    @Override
    public void fly() {
        System.out.println("Fly");
    }

}
