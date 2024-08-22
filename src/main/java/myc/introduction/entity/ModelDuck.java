package myc.introduction.entity;

import myc.introduction.behavior.impl.FlyNoWay;
import myc.introduction.behavior.impl.Quack;

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
