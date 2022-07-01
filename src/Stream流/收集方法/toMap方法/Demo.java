package Stream流.收集方法.toMap方法;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("江苏,24", "四川,21", "无锡,33", "南京,41"));

        Map<String, Integer> map = list.stream().filter((String s) -> {
            //以逗号为切割符号并且返回一个String数组
            String[] split = s.split(",");
            //保留大于大于24岁的，岁数对应的索引在String集合中为1
            int age = Integer.parseInt(split[1]);
            return age >= 24;

            //这里的终结方法只能有一个，最终collect收集方法会返回一个Map集合
        }).collect(Collectors.toMap(
                (String s) -> {
                    String key = s.split(",")[0];
                    return key;
                },
                (String s) -> {
                    int value = Integer.parseInt(s.split(",")[1]);
                    return value;
                }
        ));

        System.out.println(list);
        System.out.println(map);
    }
}
