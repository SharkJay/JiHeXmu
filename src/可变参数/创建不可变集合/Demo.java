package 可变参数.创建不可变集合;

import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = Map.ofEntries(
                Map.entry("张飞", 23),
                Map.entry("里斯", 11));

        System.out.println(stringIntegerMap);

        System.out.println("-------------------");

        Set<String> lisi = Set.of("lisi", "wew", "dwef");
        System.out.println(lisi);
    }

}
