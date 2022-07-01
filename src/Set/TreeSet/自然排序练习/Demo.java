package Set.TreeSet.自然排序练习;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        TreeSet<Student> students = new TreeSet<>();

        Student s1 = new Student("zhangsan", 21);
        Student s2 = new Student("lisan", 11);
        Student s3 = new Student("disan", 3);
        Student s4 = new Student("wusan", 34);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
