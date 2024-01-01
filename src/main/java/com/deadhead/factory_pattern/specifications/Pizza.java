package com.deadhead.factory_pattern.specifications;

import java.util.List;

public abstract class Pizza {
    protected String description;
    protected List<String> toppings;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public abstract void cut();

    public abstract void bake();

    public abstract void pack();

    @Override
    public String toString() {
        return "Pizza [description=" + description + ", toppings=" + toppings + "]";
    }

    

}
