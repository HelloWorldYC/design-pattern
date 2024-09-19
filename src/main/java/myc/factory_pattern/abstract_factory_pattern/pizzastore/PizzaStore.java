package myc.factory_pattern.abstract_factory_pattern.pizzastore;

import lombok.Data;
import myc.factory_pattern.abstract_factory_pattern.pizza.Pizza;


@Data
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 这个就是工厂方法，用来实例化 Pizza 对象
     *
     * @param type
     * @return
     */
    public abstract Pizza createPizza(String type);
}
