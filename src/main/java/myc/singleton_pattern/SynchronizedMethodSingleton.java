package myc.singleton_pattern;

/**
 * 改进单例模式
 * 同步方法处理多线程
 */
public class SynchronizedMethodSingleton {
    private static SynchronizedMethodSingleton uniqueInstance;

    private SynchronizedMethodSingleton(){}

    public static synchronized SynchronizedMethodSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedMethodSingleton();
        }

        return uniqueInstance;
    }

    // 其他有用方法
}
