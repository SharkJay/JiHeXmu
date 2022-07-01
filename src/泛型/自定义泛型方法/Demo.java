package 泛型.自定义泛型方法;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList<String> strList = addElement(new ArrayList<String>(), "张飞", "关羽", "刘备", "曹操");
        System.out.println(strList);

    }

    public static <T> ArrayList<T> addElement(ArrayList<T> list,T t1,T t2, T t3,T t4){

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        return list;

    }
}
