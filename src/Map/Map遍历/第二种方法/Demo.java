package Map.Map遍历.第二种方法;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("第1个丈夫", "第1个妻子");
        map.put("第2个丈夫", "第2个妻子");
        map.put("第3个丈夫", "第3个妻子");
        map.put("第4个丈夫", "第4个妻子");
        map.put("第5个丈夫", "第5个妻子");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);
        }
    }
}
