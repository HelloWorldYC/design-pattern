package myc.decorator_pattern;

import myc.decorator_pattern.util.SizeEnum;

/**
 * 装饰者和被装饰者的超类
 */
public abstract class Beverage {
    String description  = "Unknow Beverage";
    SizeEnum sizeEnum;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SizeEnum getSizeEnum() {
        return sizeEnum;
    }

    public void setSizeEnum(String size) {
        this.sizeEnum = SizeEnum.getSizeEnum(size);
    }

    public abstract double cost();
}
