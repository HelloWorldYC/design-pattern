package myc.decorator_pattern;

import myc.decorator_pattern.component.DarkRoast;
import myc.decorator_pattern.component.Espresso;
import myc.decorator_pattern.component.HouseBlend;
import myc.decorator_pattern.decorator.impl.Mocha;
import myc.decorator_pattern.decorator.impl.SoybeanMilk;
import myc.decorator_pattern.decorator.impl.Whip;
import myc.decorator_pattern.util.SizeEnum;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso(SizeEnum.GRANDE.getSize());
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
        System.out.println(espresso.getSizeEnum().getDollars());

        Beverage darkRoast = new DarkRoast(SizeEnum.VENTI.getSize());
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() +  " $" + darkRoast.cost());
        System.out.println(darkRoast.getSizeEnum().getDollars());

        Beverage houseBlend = new HouseBlend(SizeEnum.TALL.getSize());
        houseBlend = new SoybeanMilk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() +  " $" + houseBlend.cost());
        System.out.println(houseBlend.getSizeEnum().getDollars());
    }
}
