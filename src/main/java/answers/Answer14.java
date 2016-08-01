package answers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer14 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Caren");
        names.add("Santa");
        names.add("Alex");
        names.add("CASTA");
        names.add("Basta");
        System.out.println("Before removing: " + names);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if (name.contains("S")){
                iterator.remove();
            }
        }
        System.out.println("After removing: " + names);

    }
}
