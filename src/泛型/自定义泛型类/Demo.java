package 泛型.自定义泛型类;

public class Demo {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setElement("你好");
        System.out.println(stringBox.getElement());
    }
}
