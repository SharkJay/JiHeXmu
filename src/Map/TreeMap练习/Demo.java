package Map.TreeMap练习;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {

        /*TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });*/

        //通过Lamdba表达式
        TreeMap<Student, String> tm = new TreeMap<>((Student s1, Student s2) -> {
            int result = s1.getAge() - s2.getAge();
            result = result == 0 ? s1.getName().compareTo(s2.getName()) : result;
            return result;
        });

        Student s1 = new Student("zf", 65);
        Student s2 = new Student("sf", 33);
        Student s3 = new Student("tf", 21);
        Student s4 = new Student("af", 15);
        Student s5 = new Student("cf", 88);

        tm.put(s1, "江苏");
        tm.put(s2, "江苏");
        tm.put(s3, "辽宁");
        tm.put(s4, "四川");
        tm.put(s5, "江苏");
        
        tm.forEach((Student key, String value) -> {
            System.out.println(key + "---" + value);
        });

        /*//获取键的set集合
        Set<Student> students = tm.keySet();
        //遍历键的集合
        for (Student student : students) {
            //通过键获取值
            String strValue = tm.get(student);
            System.out.println(student + "---" + strValue);
        }*/

        /*//获取键值对的集合
        Set<Map.Entry<Student, String>> entrySet = tm.entrySet();
        for (Map.Entry<Student, String> studentStringEntry : entrySet) {
            Student key = studentStringEntry.getKey();
            String value = studentStringEntry.getValue();
            System.out.println(key + "---" + value);
        }*/
    }
}
