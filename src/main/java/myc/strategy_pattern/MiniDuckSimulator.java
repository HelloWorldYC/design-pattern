package myc.strategy_pattern;

import myc.strategy_pattern.behavior.impl.FlyRocketPowered;
import myc.strategy_pattern.entity.Duck;
import myc.strategy_pattern.entity.MallardDuck;
import myc.strategy_pattern.entity.ModelDuck;

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
