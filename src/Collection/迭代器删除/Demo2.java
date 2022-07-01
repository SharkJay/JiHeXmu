package Collection.迭代器删除;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");

        Iterator<String> iterator = arrayList.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();
            if("b".equals(s)){
                iterator.remove();
            }
        }

        System.out.println(arrayList);
    }
}
