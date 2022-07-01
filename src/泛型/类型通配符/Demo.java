package 泛型.类型通配符;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        ArrayList<Number> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        /*printArr(list1);
        printArr(list2);*/

        method2(list1);
        method2(list2);
    }

    private static void method2(ArrayList<? extends Number> list) {

    }

    private static void method1(ArrayList<? super Number> list) {

    }


    private static void printArr(ArrayList<?> list) {


    }
}
