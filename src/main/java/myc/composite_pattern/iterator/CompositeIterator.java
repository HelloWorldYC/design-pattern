package myc.composite_pattern.iterator;

import myc.composite_pattern.composite.MenuComponent;
import myc.composite_pattern.composite.impl.Menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        // 检查堆栈是否被清空，如果已经空了，表示没有下一个元素了
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator iterator = stack.peek();
            if (!iterator.hasNext()) {
                // 如果当前迭代器没有元素，我们将它弹出堆栈，然后递归调用hasNext()
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent)iterator.next();
            if (component instanceof Menu) {
                // 如果元素是一个菜单，我们有了另一个需要被包含进遍历的组合，所以将其放进堆栈中
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
