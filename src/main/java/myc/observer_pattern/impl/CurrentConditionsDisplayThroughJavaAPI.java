package myc.observer_pattern.impl;

import myc.observer_pattern.interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 使用 Java 内置的观察者模式来定义观察者
 */
public class CurrentConditionsDisplayThroughJavaAPI implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayThroughJavaAPI(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // 先确定可观察者属于 WeatherDataThroughJavaAPI 类型，再去拉取数据
        if (o instanceof WeatherDataThroughJavaAPI) {
            WeatherDataThroughJavaAPI weatherDataThroughJavaAPI = (WeatherDataThroughJavaAPI) o;
            this.temperature = weatherDataThroughJavaAPI.getTemperature();
            this.humidity = weatherDataThroughJavaAPI.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
