package myc.iterator_pattern;

import myc.iterator_pattern.menu.impl.CafeMenu;
import myc.iterator_pattern.menu.impl.DinerMenu;
import myc.iterator_pattern.menu.impl.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
