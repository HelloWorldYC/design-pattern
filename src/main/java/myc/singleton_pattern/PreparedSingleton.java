package myc.singleton_pattern;

/**
 * 改进单例模式
 * 在类加载时提前创建实例避免多线程问题
 */
public class PreparedSingleton {
    private static PreparedSingleton uniqueInstance = new PreparedSingleton();

    private PreparedSingleton() {}

    public static PreparedSingleton getInstance() {
        return uniqueInstance;
    }

    // 其他有用方法
}
