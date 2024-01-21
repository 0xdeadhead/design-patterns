package com.deadhead.iterator_pattern.specifications;

public class MenuItem {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public MenuItem() {
    }

    @Override
    public String toString() {
        return "MenuItem [name=" + name + ", price=" + price + "]";
    }

    
}
