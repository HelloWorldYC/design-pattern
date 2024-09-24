package myc.singleton_pattern;

/**
 * 改进单例模式
 * 通过双重检查加锁处理多线程
 */
public class DoubleCheckedLockingSingleton {
    // volatile 确保当 uniqueInstance 变量被引用到实例时，多个线程正确地处理 uniqueInstace 变量
    private volatile static DoubleCheckedLockingSingleton uniqueInstance;

    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
