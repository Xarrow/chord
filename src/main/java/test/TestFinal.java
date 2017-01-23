package test;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @Author zhangjian5
 * @Time 2016/10/18
 */
public class TestFinal {
    public void test1(String tmp) {
        final String str = tmp;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(str);
            }
        }).start();
    }

    public static void main(String[] args) {
//        TestFinal tf = new TestFinal();
//        tf.test1("test1");
//        tf.test1("test2");

        Map m = new HashMap<>();
        m.put(null,"dsa");
//        String[] a = new String[]{"1", "2", "3"};
//        List<String> targetList = new ArrayList<>();
//        org.springframework.util.CollectionUtils.mergeArrayIntoCollection(a, targetList);
//
//        Stream<String> b = targetList.stream().filter(s -> Integer.parseInt(s)>2);
//        b.forEach(s -> System.out.printf(s));
    }
}
