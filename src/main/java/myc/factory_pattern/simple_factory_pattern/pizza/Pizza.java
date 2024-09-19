package myc.factory_pattern.simple_factory_pattern.pizza;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public abstract class Pizza {
    private String name;    // 名称
    private String dough;   // 类型
    private String sauce;   // 酱料
    private List<String> toppings = new ArrayList();   // 佐料

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
