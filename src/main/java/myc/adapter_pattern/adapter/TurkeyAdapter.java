package myc.adapter_pattern.adapter;

import myc.adapter_pattern.interfaces.Duck;
import myc.adapter_pattern.interfaces.Turkey;

/**
 * 适配器，将 Turkey 转成 Duck
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
