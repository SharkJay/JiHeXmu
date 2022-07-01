package Stream流.中间方法.其他方法;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(List.of("葫芦娃", "蝙蝠侠", "炸鸡柳", "炸鸡柳", "炸鱿鱼", "炸淀粉肠"));

        //Stream limit(long maxSize) 返回此流中的元素组成的流，截取前指定参数个数的数据
        //list1.stream().limit(3).forEach(s -> System.out.println(s));

        //Stream skip(long n) 跳过指定参数个数的数据，返回由该流的剩余元素组成的流
        //list1.stream().skip(2).forEach(s-> System.out.println(s));

        //static Stream concat(Stream a,Stream b) 合并a和b两个流为一个流
        /*ArrayList<String> list2 = new ArrayList<>(List.of("葫芦娃", "蝙蝠侠", "炸鸡柳", "炸鱿鱼", "炸淀粉肠"));
        Stream.concat(list1.stream(),list2.stream()).forEach(s-> System.out.println(s));*/

        //Stream distinct()
        //返回由该流的不同元素（根据Object.equals(Object) ）组
        //成的流
        list1.stream().distinct().forEach(s -> System.out.println(s));
    }
}
