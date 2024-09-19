package myc.factory_pattern.simple_factory_pattern.pizzastore;

import lombok.Data;

import myc.factory_pattern.simple_factory_pattern.SimplePizzaFactory;
import myc.factory_pattern.simple_factory_pattern.pizza.Pizza;

@Data
public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
