package myc.decorator_pattern.component;

import myc.decorator_pattern.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(String size) {
        setDescription("House Blend Coffee");
        setSizeEnum(size);
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
