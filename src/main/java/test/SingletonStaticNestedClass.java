package test;

/**
 * @Author: zhang
 * @Time:2017/2/1 静态内部类
 */
public class SingletonStaticNestedClass {
    private static class SingletonHolder {
        private static final SingletonStaticNestedClass INSTANCE = new SingletonStaticNestedClass();

    }

    private SingletonStaticNestedClass() {
    }

    public static SingletonStaticNestedClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
