package myc.composite_pattern.iterator;

import java.util.Iterator;

/**
 * 空迭代器，其作用就是“没作用”
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
