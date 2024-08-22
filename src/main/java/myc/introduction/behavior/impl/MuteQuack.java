package myc.introduction.behavior.impl;

import myc.introduction.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
