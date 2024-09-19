package myc.factory_pattern.factory_method_pattern.pizzastore.impl;

import myc.factory_pattern.factory_method_pattern.pizza.Pizza;
import myc.factory_pattern.factory_method_pattern.pizza.impl.NYStyleClamPizza;
import myc.factory_pattern.factory_method_pattern.pizza.impl.NYStylePepperoniPizza;
import myc.factory_pattern.factory_method_pattern.pizza.impl.NYStyleVeggiePizza;
import myc.factory_pattern.factory_method_pattern.pizza.impl.NyStypeCheesePizza;
import myc.factory_pattern.factory_method_pattern.pizzastore.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NyStypeCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
