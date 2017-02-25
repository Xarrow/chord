package test;

/**
 * @Author: zhang
 * @Time:2017/2/1
 */
public class SingtonTest {
    private static SingtonTest singtonTest = new SingtonTest();

    private SingtonTest() {
    }

    public static SingtonTest getInstance() {
        return singtonTest;
    }
}
