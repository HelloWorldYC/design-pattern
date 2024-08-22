package myc.introduction;

import myc.introduction.behavior.impl.FlyRocketPowered;
import myc.introduction.entity.Duck;
import myc.introduction.entity.MallardDuck;
import myc.introduction.entity.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
