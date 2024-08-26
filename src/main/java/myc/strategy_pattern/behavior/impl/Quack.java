package myc.strategy_pattern.behavior.impl;

import myc.strategy_pattern.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
