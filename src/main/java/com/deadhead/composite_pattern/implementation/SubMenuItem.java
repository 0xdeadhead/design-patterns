package com.deadhead.composite_pattern.implementation;

import com.deadhead.composite_pattern.specifications.MenuComponent;

public class SubMenuItem extends MenuComponent {
    private String name;
    private String description;
    private Double price;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
    

    public SubMenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem [name=" + name + ", description=" + description + ", price=" + price + "]";
    }

}
