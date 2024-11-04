package myc.template_method_pattern;

import myc.template_method_pattern.caffeine.impl.CoffeeWithHook;
import myc.template_method_pattern.caffeine.impl.TeaWithHook;

public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
