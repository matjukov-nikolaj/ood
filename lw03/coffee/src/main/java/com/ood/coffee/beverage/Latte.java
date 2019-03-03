package com.ood.coffee.beverage;

public class Latte extends Coffee {

    private CoffeeType type;

    public Latte(CoffeeType type) {
        super(type.toString() + "Latte");
        this.type = type;
    }

    @Override
    public double getCost() {
        return this.type == CoffeeType.STANDARD ? 90 : 130;
    }
}
