package myc.factory_pattern.abstract_factory_pattern;

import myc.factory_pattern.abstract_factory_pattern.pizza.Pizza;
import myc.factory_pattern.abstract_factory_pattern.pizzastore.PizzaStore;
import myc.factory_pattern.abstract_factory_pattern.pizzastore.impl.NYPizzaStore;

public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        System.out.println();
    }
}
