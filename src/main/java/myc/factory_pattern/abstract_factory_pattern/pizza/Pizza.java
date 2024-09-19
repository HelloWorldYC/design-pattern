package myc.factory_pattern.abstract_factory_pattern.pizza;

import lombok.Data;
import myc.factory_pattern.abstract_factory_pattern.ingredients.cheese.Cheese;
import myc.factory_pattern.abstract_factory_pattern.ingredients.clams.Clams;
import myc.factory_pattern.abstract_factory_pattern.ingredients.dough.Dough;
import myc.factory_pattern.abstract_factory_pattern.ingredients.pepperoni.Pepperoni;
import myc.factory_pattern.abstract_factory_pattern.ingredients.sauce.Sauce;
import myc.factory_pattern.abstract_factory_pattern.ingredients.viggies.Veggies;

@Data
public abstract class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Veggies veggies[];
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clams clams;

    public abstract void prepare();

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
