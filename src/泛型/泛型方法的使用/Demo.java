package 泛型.泛型方法的使用;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("我是刘备");
        list.add("我是关羽");
        list.add("我是张飞");
        list.add("我是曹操");

        String[] strings = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(strings));
    }
}
