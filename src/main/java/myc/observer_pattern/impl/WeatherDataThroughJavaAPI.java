package myc.observer_pattern.impl;

import java.util.Observable;

/**
 * 使用 Java 内置的观察者模式来定义可观察者，也就是主题
 */
public class WeatherDataThroughJavaAPI extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataThroughJavaAPI(){}

    public void measurementsChanged() {
        setChanged();
        // notifyObservers() 方法没有传送数据对象，表示采用的做法是“拉”，通知观察者自己来拉取数据
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
