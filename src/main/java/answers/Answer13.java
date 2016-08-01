package answers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer13 {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>(); // создание объекта HashMap

        Iterator<Map.Entry<Integer,String>> iterator = myMap.entrySet().iterator(); // создание итератора для HashMap
        while (iterator.hasNext()){         // пока существует следующий элемент итератора
            Map.Entry<Integer,String> pair = iterator.next(); // запись текущей пару <ключ, значения> в pair
            int key = pair.getKey();        // получение ключа
            String value = pair.getValue();     // получение значения
            System.out.println(key + " " + value);   // вывод на экран
        }
    }
}
