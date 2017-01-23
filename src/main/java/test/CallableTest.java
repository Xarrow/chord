package test;

import java.util.concurrent.Callable;

/**
 * Author ZhangJian
 * Time 2017/1/20
 */
public class CallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.printf("子线程正在运行");
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        return sum;
    }
}
