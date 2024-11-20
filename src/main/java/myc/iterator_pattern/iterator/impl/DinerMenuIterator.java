package myc.iterator_pattern.iterator.impl;

import myc.iterator_pattern.menu.impl.MenuItem;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }

        // 将当前元素移除，并将后面的元素往前移动一个位置
        if (items[position - 1] != null) {
            for (int i = position - 1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
