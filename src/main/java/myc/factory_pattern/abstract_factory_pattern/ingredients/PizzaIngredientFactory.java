package myc.factory_pattern.abstract_factory_pattern.ingredients;

import myc.factory_pattern.abstract_factory_pattern.ingredients.cheese.Cheese;
import myc.factory_pattern.abstract_factory_pattern.ingredients.clams.Clams;
import myc.factory_pattern.abstract_factory_pattern.ingredients.dough.Dough;
import myc.factory_pattern.abstract_factory_pattern.ingredients.pepperoni.Pepperoni;
import myc.factory_pattern.abstract_factory_pattern.ingredients.sauce.Sauce;
import myc.factory_pattern.abstract_factory_pattern.ingredients.viggies.Veggies;

/**
 * 抽象工厂，用于创建不同类型的Pizza原料
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
