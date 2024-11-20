package myc.iterator_pattern.iterator.impl;

import myc.iterator_pattern.iterator.Iterator;
import myc.iterator_pattern.menu.impl.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
