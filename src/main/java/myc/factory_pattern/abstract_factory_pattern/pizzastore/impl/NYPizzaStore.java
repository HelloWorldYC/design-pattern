package myc.factory_pattern.abstract_factory_pattern.pizzastore.impl;

import myc.factory_pattern.abstract_factory_pattern.ingredients.NYPizzaIngredientFactory;
import myc.factory_pattern.abstract_factory_pattern.ingredients.PizzaIngredientFactory;
import myc.factory_pattern.abstract_factory_pattern.pizza.Pizza;
import myc.factory_pattern.abstract_factory_pattern.pizza.impl.CheesePizza;
import myc.factory_pattern.abstract_factory_pattern.pizza.impl.ClamPizza;
import myc.factory_pattern.abstract_factory_pattern.pizza.impl.PepperoniPizza;
import myc.factory_pattern.abstract_factory_pattern.pizza.impl.VeggiePizza;
import myc.factory_pattern.abstract_factory_pattern.pizzastore.PizzaStore;


public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
