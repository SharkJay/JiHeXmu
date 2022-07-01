package Collection.增强for循环;

import java.util.ArrayList;

/*它是JDK5之后出现的,其内部原理是一个Iterator迭代器
实现Iterable接口的类才可以使用迭代器和增强for
简化数组和Collection集合的遍历

格式
for(集合/数组中元素的数据类型 变量名 : 集合/数组名) {
// 已经将当前遍历到的元素封装到变量中了,直接使用变量即可
}*/

public class Demo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");
        list.add("f");
        list.add("g");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
