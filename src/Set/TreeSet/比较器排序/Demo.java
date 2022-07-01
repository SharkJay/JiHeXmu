package Set.TreeSet.比较器排序;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("dhangsan", 11);
        Student s3 = new Student("qhangsan", 3);
        Student s4 = new Student("ahangsan", 66);
        Student s5 = new Student("khangsan", 9);

        //TreeSet带参数构造方法，比较器排序
        TreeSet<Student> treeSet = new TreeSet<>(/*new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                return result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
            }
        }*/

                //Lamdba表达式形式
                //有一个Comparator接口，只有一个compare抽象方法，满足Lamdba使用条件
                (Student o1, Student o2) -> {
                    int result = o1.getAge() - o2.getAge();
                    return result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                }
        );

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);

        for (Student student : treeSet) {
            System.out.println(student);
        }
    }
}
