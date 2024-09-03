package myc.decorator_pattern.decorator.impl;

import myc.decorator_pattern.Beverage;
import myc.decorator_pattern.decorator.CondimentDecorator;
import myc.decorator_pattern.util.SizeEnum;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost() + beverage.getSizeEnum().getDollars();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public SizeEnum getSizeEnum() {
        return beverage.getSizeEnum();
    }
}
