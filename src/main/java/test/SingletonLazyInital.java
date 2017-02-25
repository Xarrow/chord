package test;

/**
 * @Author: zhang
 * @Time:2017/2/1 单列懒加载
 */
class SingletonLazyInital {
    private static SingletonLazyInital sintonLazyInital = null;

    private SingletonLazyInital() {
    }

    public static SingletonLazyInital getSintonLazyInital() {
        if (null == sintonLazyInital) {
            sintonLazyInital = new SingletonLazyInital();
        }
        return sintonLazyInital;
    }
}
