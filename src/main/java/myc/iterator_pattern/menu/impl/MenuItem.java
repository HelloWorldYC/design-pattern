package myc.iterator_pattern.menu.impl;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
}
