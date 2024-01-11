package com.deadhead.adapter_pattern.implementation;

import com.deadhead.adapter_pattern.specifications.Duck;
import com.deadhead.adapter_pattern.specifications.Turkey;

public class DuckAdapter implements Duck {

    private Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        this.turkey.bobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            this.turkey.fly();
        }
    }

}
