package com.deadhead.composite_pattern.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.deadhead.composite_pattern.specifications.MenuComponent;

public class SubMenu extends MenuComponent {

    private String name;
    private String description;
    private List<MenuComponent> menuComponents;

    public SubMenu(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public SubMenu() {
        this.menuComponents = new ArrayList<MenuComponent>();
    }

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
        Iterator<MenuComponent> subMenuIterator = this.menuComponents.iterator();
        Double sum = 0.0d;
        while (subMenuIterator.hasNext()) {
            sum += subMenuIterator.next().getPrice();
        }
        return sum;

    }

    @Override
    public void addComponent(MenuComponent menuComponent) {
        this.menuComponents.add(menuComponent);
    }

    @Override
    public void removeComponent(MenuComponent menuComponent) {
        this.menuComponents.removeIf(component -> component == menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return this.menuComponents.get(index);
    }

    @Override
    public void print() {
        System.out.println(this.toString());
        Iterator<MenuComponent> subMenuIterator = this.menuComponents.iterator();
        while (subMenuIterator.hasNext()) {
            subMenuIterator.next().print();
        }
    }

    @Override
    public String toString() {

        return "SubMenu [name=" + name + ", description=" + description + "]";

    }

}
