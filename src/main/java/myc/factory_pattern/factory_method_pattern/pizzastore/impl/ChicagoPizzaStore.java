package myc.factory_pattern.factory_method_pattern.pizzastore.impl;

import myc.factory_pattern.factory_method_pattern.pizza.Pizza;
import myc.factory_pattern.factory_method_pattern.pizza.impl.ChicagoStyleCheesePizza;
import myc.factory_pattern.factory_method_pattern.pizza.impl.ChicagoStyleClamPizza;
import myc.factory_pattern.factory_method_pattern.pizza.impl.ChicagoStylePepperoniPizza;
import myc.factory_pattern.factory_method_pattern.pizza.impl.ChicagoStyleVeggiePizza;
import myc.factory_pattern.factory_method_pattern.pizzastore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
