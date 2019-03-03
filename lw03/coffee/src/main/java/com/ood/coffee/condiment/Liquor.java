package com.ood.coffee.condiment;

import com.ood.coffee.beverage.Beverage;

public class Liquor extends CondimentDecorator {

    private final LiquorType type;

    public Liquor(Beverage beverage, LiquorType type) {
        super(beverage);
        this.type = type;
    }

    protected String getCondimentDescription() {
        return this.type.toString() + "liquor";
    }

    protected double getCondimentCost() {
        return 50;
    }

}
