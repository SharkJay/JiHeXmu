package Collection.成员方法;

import java.util.ArrayList;
import java.util.Collection;

public class Demo {
    public static void main(String[] args) {

        //boolean removeIf(Object o) 根据条件进行移除
        Collection<String> collection = new ArrayList<>();

        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("vvvv");

        //boolean test(T t);
        //removeIf中操作的是一个接口，且该接口只有一个抽象类，所以可以用Lamdba表达式替换

        collection.removeIf((String s) -> {
            return s.length() == 3;
        });

        System.out.println(collection);
    }
}
