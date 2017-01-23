package test;

import java.util.concurrent.*;

/**
 * Author ZhangJian
 * Time 2017/1/20
 */
public class NettyTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        CallableTest callableTest = new CallableTest();
        Future task = executor.submit(callableTest);
        try {
            System.out.printf(String.valueOf(task.get()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

