package myc.observer_pattern.impl;

import myc.observer_pattern.interfaces.DisplayElement;
import myc.observer_pattern.interfaces.Observer;
import myc.observer_pattern.interfaces.Subject;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float heatIndex;
    private Subject subject;
    // 酷热指数计算所需的常数值
    final double c1 = -8.78469475556;
    final double c2 = 1.61139411;
    final double c3 = 2.33854883889;
    final double c4 = -0.14611605;
    final double c5 = -0.012308094;
    final double c6 = -0.0164248277778;
    final double c7 = 0.002211732;
    final double c8 = 0.00072546;
    final double c9 = -0.000003582;

    public HeatIndexDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        heatIndex = (float) (c1 + c2 * temperature + c3 * humidity
                        + c4 * temperature * humidity
                        + c5 * Math.pow(temperature, 2)
                        + c6 * Math.pow(humidity, 2)
                        + c7 * Math.pow(temperature, 2) * humidity
                        + c8 * temperature * Math.pow(humidity, 2)
                        + c9 * Math.pow(temperature, 2) * Math.pow(humidity, 2));
        display();
    }
}
