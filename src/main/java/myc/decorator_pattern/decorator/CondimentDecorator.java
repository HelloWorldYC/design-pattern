package myc.decorator_pattern.decorator;

import myc.decorator_pattern.Beverage;
import myc.decorator_pattern.util.SizeEnum;

/**
 * 装饰者抽象类，装饰者继承这个类
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();

    public abstract SizeEnum getSizeEnum();
}
