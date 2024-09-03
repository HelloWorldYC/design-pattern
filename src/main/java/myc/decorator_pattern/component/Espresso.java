package myc.decorator_pattern.component;

import myc.decorator_pattern.Beverage;

public class Espresso extends Beverage {

    public Espresso(String size) {
        setDescription("Espresso");
        setSizeEnum(size);
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
