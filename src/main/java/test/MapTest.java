package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Author ZhangJian
 * Time 2017/2/13
 */
public class MapTest {
    public static void main(String[] args) {
//        new Thread(() -> System.out.printf("hello")).start();
//        java8();
        java8List();

    }

    static void java8() {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 1);
        items.put("B", 2);
        items.put("C", 3);
        items.put("D", 4);
        for (String i : items.keySet()) {
            System.out.printf(i + "-->" + items.get(i));
        }

        System.out.printf("lambda");
        items.forEach((k, v) -> {
            System.out.printf(k + "-->" + v);
        });
    }

    static void java8List() {
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        l.add("F");
        l.add("BB");
        l.add("BBB");
        Stream<String> a = l.stream().filter(w -> w.startsWith("B"));
        System.out.printf(a
                .reduce((t, u) ->
                        t + "\n" + u
                ).get());

    }
}
