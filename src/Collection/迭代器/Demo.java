package Collection.迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");

        Iterator<String> iterator = collection.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
