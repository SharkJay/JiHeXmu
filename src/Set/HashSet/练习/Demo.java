package Set.HashSet.练习;

import java.util.HashSet;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student("xzchr", 22);
        Student s2 = new Student("xzchr", 22);
        Student s3 = new Student("erchr", 12);

        HashSet<Student> hashSet = new HashSet<>();

        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);

        for (Student student : hashSet) {
            System.out.println(student);
        }
    }
}
