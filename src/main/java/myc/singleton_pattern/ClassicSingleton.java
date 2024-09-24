package myc.singleton_pattern;

/**
 * 经典的单例模式
 * 在多线程情况下有缺陷
 */
public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {}

    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }

    // 其他有用方法
}
