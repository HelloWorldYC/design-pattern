package myc.adapter_pattern;

import myc.adapter_pattern.adapter.TurkeyAdapter;
import myc.adapter_pattern.interfaces.Duck;
import myc.adapter_pattern.interfaces.impl.MallardDuck;
import myc.adapter_pattern.interfaces.impl.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        duck.quack();
        duck.fly();

        System.out.println("\nThe TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
