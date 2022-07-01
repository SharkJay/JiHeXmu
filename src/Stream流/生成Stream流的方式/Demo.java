package Stream流.生成Stream流的方式;

import java.util.*;
import java.util.stream.Stream;

/*生成Stream流的方式*/
public class Demo {
    public static void main(String[] args) {
        //listMethod();
        //mapStream();
        //arrStream();
        intStream();
    }

    private static void intStream() {
    /*同种数据类型的多个数据
    通过Stream接口的静态方法of(T... values)生成流*/
        Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));
    }

    private static void arrStream() {
    /*数组
通过Arrays中的静态方法stream生成流*/
        String[] arrString = new String[]{"牛逼", "hhh ", "eee"};
        Arrays.stream(arrString).forEach(s -> System.out.println(s));
    }

    private static void mapStream() {
    /*Map体系集合
把Map转成Set集合，间接的生成流*/
        HashMap<String, Integer> hm = new HashMap<>(Map.ofEntries(
                Map.entry("你好", 22),
                Map.entry("换行", 11),
                Map.entry("牛逼", 88)));

        /*Set<String> keySet = hm.keySet();
        keySet.stream().forEach(s-> System.out.println(s));*/

        Set<Map.Entry<String, Integer>> entrySet = hm.entrySet();
        entrySet.stream().forEach(s -> System.out.println(s));
    }

    private static void listMethod() {
        //        Collection体系集合
//        使用默认方法stream()生成流， default Stream stream()
        ArrayList<String> arrayList = new ArrayList<>(List.of("张三", "里斯", "王二"));
        arrayList.stream().forEach(s -> System.out.println(s));
    }
}
