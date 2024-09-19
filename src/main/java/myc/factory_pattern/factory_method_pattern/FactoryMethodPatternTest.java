package myc.factory_pattern.factory_method_pattern;

import myc.factory_pattern.factory_method_pattern.pizza.Pizza;
import myc.factory_pattern.factory_method_pattern.pizzastore.PizzaStore;
import myc.factory_pattern.factory_method_pattern.pizzastore.impl.ChicagoPizzaStore;
import myc.factory_pattern.factory_method_pattern.pizzastore.impl.NYPizzaStore;

public class FactoryMethodPatternTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        System.out.println();

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
