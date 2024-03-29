package com.deadhead.composite_pattern.specifications;

public abstract class MenuComponent {
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    };

    public Double getPrice() {
        throw new UnsupportedOperationException();
    };

    public void addComponent(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    };

    public void removeComponent(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    };

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    };

    public void print() {
        throw new UnsupportedOperationException();
    };
}
