package myc.factory_pattern.factory_method_pattern.pizza.impl;

import myc.factory_pattern.factory_method_pattern.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        setName("Chicago Style Deep Dish Cheese Pizza");
        setDough("Extra Thick Crust Dough");
        setSauce("Plum Tomato  Sauce");
        getToppings().add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
