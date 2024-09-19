package myc.factory_pattern.simple_factory_pattern;


import myc.factory_pattern.simple_factory_pattern.pizza.Pizza;
import myc.factory_pattern.simple_factory_pattern.pizza.impl.CheesePizza;
import myc.factory_pattern.simple_factory_pattern.pizza.impl.ClamPizza;
import myc.factory_pattern.simple_factory_pattern.pizza.impl.PepperoniPizza;
import myc.factory_pattern.simple_factory_pattern.pizza.impl.VeggiePizza;

public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
