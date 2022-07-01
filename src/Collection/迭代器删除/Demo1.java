package Collection.迭代器删除;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");

        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);

            if("b".equals(s)){
                arrayList.remove(i);
                i--;
            }
        }

        System.out.println(arrayList);
    }
}
