package Map.常用方法;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {

        HashMap<String,String> hm = new HashMap<>();

//        V put(K key,V value) 添加元素
        hm.put("itheima001","张飞");
        hm.put("itheima002","li飞");
        hm.put("itheima003","w飞");
        hm.put("itheima004","c飞");
        hm.put("itheima005","a飞");

        System.out.println(hm);
//        V remove(Object key) 根据键删除键值对元素
//        void clear() 移除所有的键值对元素
//        boolean containsKey(Object key) 判断集合是否包含指定的键
//        boolean containsValue(Object value) 判断集合是否包含指定的值
//        boolean isEmpty() 判断集合是否为空
        boolean empty = hm.isEmpty();
        System.out.println(empty);
//        int size() 集合的长度，也就是集合中键值对的个数
        int size = hm.size();
        System.out.println(size);

    }
}
