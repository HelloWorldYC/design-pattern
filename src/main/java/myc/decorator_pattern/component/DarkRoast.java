package myc.decorator_pattern.component;

import myc.decorator_pattern.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(String size) {
        setDescription("Dark Roast");
        setSizeEnum(size);
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
