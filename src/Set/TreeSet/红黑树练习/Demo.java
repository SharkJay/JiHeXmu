package Set.TreeSet.红黑树练习;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getChinese() - o2.getChinese();
                result = result == 0 ? o1.getEnglish() - o2.getEnglish() : result;
                result = result == 0 ? o1.getMath() - o2.getMath() : result;
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });

        Student s1 = new Student("zhfsf", 12,12,13);
        Student s2 = new Student("gbrseb", 21,2,43);
        Student s3 = new Student("uyklo", 4,34,55);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);

        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
