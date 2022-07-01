package Map.Map遍历.第一种方法;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("1号丈夫", "1号妻子");
        map.put("2号丈夫", "2号妻子");
        map.put("3号丈夫", "3号妻子");
        map.put("4号丈夫", "4号妻子");
        map.put("5号丈夫", "5号妻子");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
