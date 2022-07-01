package Stream流.收集方法.toList与toSet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        //R collect(Collector collector) 把结果收集到集合中
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        List<Integer> collect = list.stream().
                filter(number -> number % 2 == 0).collect(Collectors.toList());

        System.out.println(collect);
    }
}
