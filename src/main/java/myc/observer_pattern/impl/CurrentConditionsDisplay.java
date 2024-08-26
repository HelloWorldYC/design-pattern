package myc.observer_pattern.impl;

import myc.observer_pattern.interfaces.DisplayElement;
import myc.observer_pattern.interfaces.Observer;
import myc.observer_pattern.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject subject;

    /**
     * 构造器中注册观察者
     */
    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
