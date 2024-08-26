package myc.observer_pattern.interfaces;

public interface Subject {
    /**
     * 注册某个观察者
     * @param observer 观察者实现
     */
    void registerObserver(Observer observer);

    /**
     * 移除某个观察者
     * @param observer 观察者实现
     */
    void removeObserver(Observer observer);

    /**
     * 当主题状态改变时，这个方法会被调用，以通知所有观察者
     */
    void notifyObservers();
}
