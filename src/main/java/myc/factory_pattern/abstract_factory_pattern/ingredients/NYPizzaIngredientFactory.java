package myc.factory_pattern.abstract_factory_pattern.ingredients;

import myc.factory_pattern.abstract_factory_pattern.ingredients.cheese.Cheese;
import myc.factory_pattern.abstract_factory_pattern.ingredients.cheese.ReggianoCheese;
import myc.factory_pattern.abstract_factory_pattern.ingredients.clams.Clams;
import myc.factory_pattern.abstract_factory_pattern.ingredients.clams.FreshClams;
import myc.factory_pattern.abstract_factory_pattern.ingredients.dough.Dough;
import myc.factory_pattern.abstract_factory_pattern.ingredients.dough.ThinCrustDough;
import myc.factory_pattern.abstract_factory_pattern.ingredients.pepperoni.Pepperoni;
import myc.factory_pattern.abstract_factory_pattern.ingredients.pepperoni.SlicedPepperoni;
import myc.factory_pattern.abstract_factory_pattern.ingredients.sauce.MarinaraSauce;
import myc.factory_pattern.abstract_factory_pattern.ingredients.sauce.Sauce;
import myc.factory_pattern.abstract_factory_pattern.ingredients.viggies.Garlic;
import myc.factory_pattern.abstract_factory_pattern.ingredients.viggies.Mushroom;
import myc.factory_pattern.abstract_factory_pattern.ingredients.viggies.Onion;
import myc.factory_pattern.abstract_factory_pattern.ingredients.viggies.RedPepper;
import myc.factory_pattern.abstract_factory_pattern.ingredients.viggies.Veggies;

/**
 * 具体工厂，能够创建一系列具体产品类实例
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
