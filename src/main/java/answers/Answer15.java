package answers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer15 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Caren");
        names.add("Santa");
        names.add("Alex");
        names.add("CASTA");
        names.add("Basta");
        System.out.println("Before sorting " + names);
        System.out.println("After sorting " + sortNames(names));
    }

    public static List<String> sortNames(List<String> names){   // сортировка пузырьком
       boolean isSwapped = true;
        while (isSwapped){
            isSwapped = false;
            for (int i = 1; i < names.size(); i++) {
                if (names.get(i).compareTo(names.get(i - 1)) > 0){
                    String swap = names.get(i);
                    names.set(i, names.get(i - 1));
                    names.set(i - 1, swap);
                    isSwapped = true;
                }
            }
        }
        return names;
    }
}
