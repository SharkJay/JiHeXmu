package Stream流.中间方法.filter方法;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("张麻子", "拿破仑", "哈哈哈", "张牛牛"));

        /*//匿名内部类方法
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                boolean result = s.startsWith("张");
                return result;
            }
        }).forEach(s-> System.out.println(s));*/

        /*//因为Predicate接口只有一个抽象方法，所以可以使用Lamdba表达式
        list.stream().filter((String s) -> {
            boolean result = s.startsWith("张");
            return result;
        }).forEach(s -> System.out.println(s));*/

        //Lamdba简化版本....一行代码搞定
        list.stream().filter( s -> s.startsWith("张")).forEach(s -> System.out.println(s));
    }
}
