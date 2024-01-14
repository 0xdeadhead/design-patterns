package com.deadhead.template_pattern.specification;

public abstract class HotBeverage {

    // templating main algorithm and declaring it as final prevents method
    // overriding in sub class
    // Obeys Open Closed Principle
    public final void prepareRecipe() {

        boilWater();
        brew();
        addCondiment();
        pourIntoCup();

    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourIntoCup() {
        System.out.println("Drink is poured into cup");
    }

    public abstract void brew();

    public abstract void addCondiment();

}
