package test;

/**
 * @Author: zhang
 * @Time:2017/2/1
 */
public class SingletonLazyDoubleCheck {
    private static SingletonLazyDoubleCheck singletonLazyDoubleCheck = null;

    private SingletonLazyDoubleCheck() {
    }

    public static SingletonLazyDoubleCheck getSingletonLazyDoubleCheck() {
        if (null == singletonLazyDoubleCheck) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (null == singletonLazyDoubleCheck) {
                    singletonLazyDoubleCheck = new SingletonLazyDoubleCheck();
                }
            }
        }
        return singletonLazyDoubleCheck;
    }
}

