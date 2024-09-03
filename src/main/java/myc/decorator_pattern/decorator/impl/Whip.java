package myc.decorator_pattern.decorator.impl;

import myc.decorator_pattern.Beverage;
import myc.decorator_pattern.decorator.CondimentDecorator;
import myc.decorator_pattern.util.SizeEnum;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost() + beverage.getSizeEnum().getDollars();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public SizeEnum getSizeEnum() {
        return beverage.getSizeEnum();
    }
}
