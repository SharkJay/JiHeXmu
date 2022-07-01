package Set.TreeSet.自然排序练习;

public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        //o是先前存入的年龄，而this是当前准备存入的年龄，两者比较
        int result = this.age - o.age;
        result = result == 0 ? this.name.compareTo(o.name) : result;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
