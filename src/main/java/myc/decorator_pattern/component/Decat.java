package myc.decorator_pattern.component;

import myc.decorator_pattern.Beverage;

public class Decat extends Beverage {

    public Decat(String size) {
        setDescription("Decat");
        setSizeEnum(size);
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
