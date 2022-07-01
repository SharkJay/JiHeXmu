package Stream流.Stream练习;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
男演员只要名字为3个字的前三人
女演员只要姓林的，并且不要第一个
把过滤后的男演员姓名和女演员姓名合并到一起
把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法*/
public class Demo {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(List.of("周润发", "成龙", "刘德华", "吴京", "周星驰", "房祖名"));
        ArrayList<String> list2 = new ArrayList<>(List.of("刘亦菲", "林青霞", "林心如", "容祖儿", "周海媚", "杨幂"));

        Stream<String> stream1 = list1.stream().filter(mansName -> mansName.length() == 3).limit(3);
        Stream<String> stream2 = list2.stream().filter(womenName -> womenName.startsWith("林")).skip(1);

        Stream.concat(stream1, stream2).forEach(name -> {
            Actor actor = new Actor(name);
            System.out.println(actor);
        });


    }
}
