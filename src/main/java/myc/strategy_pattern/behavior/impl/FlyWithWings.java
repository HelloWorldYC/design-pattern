package myc.strategy_pattern.behavior.impl;

import myc.strategy_pattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
