
package SomeUsefullClasses;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class JavaUtilCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
