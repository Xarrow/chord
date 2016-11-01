package test;

import org.junit.Test;

/**
 * @Author zhangjian5
 * @Time 2016/10/18
 */
public class TestFinal {
    public void test1(String tmp){
        final String str = tmp;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(str);
            }
        }).start();
    }

    public static void main(String[] args) {
        TestFinal tf = new TestFinal();
        tf.test1("test1");
        tf.test1("test2");
    }
}
