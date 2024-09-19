package myc.factory_pattern.simple_factory_pattern;

import myc.factory_pattern.simple_factory_pattern.pizza.Pizza;
import myc.factory_pattern.simple_factory_pattern.pizzastore.PizzaStore;

public class SimpleFactoryPatternTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza cheesePizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + cheesePizza.getName());
        System.out.println();

        Pizza clamPizza = pizzaStore.orderPizza("clam");
        System.out.println("Joel ordered a " + clamPizza.getName());
    }
}
