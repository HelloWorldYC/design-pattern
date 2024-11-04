package myc.template_method_pattern.caffeine.impl;

import myc.template_method_pattern.caffeine.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
