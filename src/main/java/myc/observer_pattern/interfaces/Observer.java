package myc.observer_pattern.interfaces;

public interface Observer {
    /**
     * 主题状态改变时，观察者要做的事
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 压强
     */
    void update(float temperature, float humidity, float pressure);
}
