package myc.strategy_pattern.entity;

import myc.strategy_pattern.behavior.impl.FlyWithWings;
import myc.strategy_pattern.behavior.impl.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
