package myc.iterator_pattern.menu.impl;

import myc.iterator_pattern.menu.Menu;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
    private Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new Hashtable<>();
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        // Hashtable 支持 Java 内置的迭代器，这里不是取得整个 Hashtable 的迭代器，而是取得值的部分的迭代器
        return menuItems.values().iterator();
    }
}
