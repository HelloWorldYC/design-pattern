package myc.factory_pattern.abstract_factory_pattern.pizza.impl;

import myc.factory_pattern.abstract_factory_pattern.ingredients.PizzaIngredientFactory;
import myc.factory_pattern.abstract_factory_pattern.pizza.Pizza;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setSauce(pizzaIngredientFactory.createSauce());
        setCheese(pizzaIngredientFactory.createCheese());
        setClams(pizzaIngredientFactory.createClam());
    }
}
