package 可变参数.可变参数应用;

public class Demo {
    public static void main(String[] args) {

        System.out.println(sum(1, 5, 6, 8, 9, 8, 10));
    }

    public static int sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        return sum;
    }
}
