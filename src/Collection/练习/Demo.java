package Collection.练习;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三", 21);
        Student s2 = new Student("张a", 22);
        Student s3 = new Student("张c", 23);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("-------------");

        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

    }
}
