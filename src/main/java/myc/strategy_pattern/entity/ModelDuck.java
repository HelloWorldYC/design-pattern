package myc.strategy_pattern.entity;

import myc.strategy_pattern.behavior.impl.FlyNoWay;
import myc.strategy_pattern.behavior.impl.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
