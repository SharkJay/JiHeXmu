package Map.HashMap练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("张飞", 21);
        Student s2 = new Student("李飞", 31);
        Student s3 = new Student("去飞", 1);

        hm.put(s1, "南京");
        hm.put(s2, "东京");
        hm.put(s3, "西京");

        //不同方式遍历
        Set<Student> students = hm.keySet();
        for (Student student : students) {
            String value = hm.get(student);
            System.out.println(student + "---" + value);
        }

        System.out.println("----------------------------");

        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> studentStringEntry : entries) {

            Student key = studentStringEntry.getKey();
            String value = studentStringEntry.getValue();

            System.out.println(key + "---" + value);
        }

        System.out.println("--------------------------------");

        //有参数无返回值类型的Lamdba表达式
        hm.forEach((Student s, String str) -> {
            System.out.println(s + "---" + str);
        });
    }
}
