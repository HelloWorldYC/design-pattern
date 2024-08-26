package myc.strategy_pattern.behavior.impl;

import myc.strategy_pattern.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
