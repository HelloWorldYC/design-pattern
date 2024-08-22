package myc.introduction.behavior.impl;

import myc.introduction.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
