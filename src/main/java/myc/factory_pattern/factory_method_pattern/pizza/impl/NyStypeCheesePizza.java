package myc.factory_pattern.factory_method_pattern.pizza.impl;

import myc.factory_pattern.factory_method_pattern.pizza.Pizza;

public class NyStypeCheesePizza extends Pizza {
    public NyStypeCheesePizza() {
        setName("NY Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");
        getToppings().add("Grated Reggiano Cheese");
    }
}
