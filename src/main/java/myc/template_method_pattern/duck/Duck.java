package myc.template_method_pattern.duck;

import lombok.Data;

/**
 * Java API 中的模板方法模式
 * 数组排序sort()方法已经提供了算法，但是数组无法被继承，所以sort()方法被设计为静态方法，并利用 Comparable 接口
 */
@Data
public class Duck implements Comparable {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }

    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck) object;
        if (weight < otherDuck.getWeight()) {
            return -1;
        } else if (weight == otherDuck.getWeight()) {
            return 0;
        } else {
            return 1;
        }
    }
}
