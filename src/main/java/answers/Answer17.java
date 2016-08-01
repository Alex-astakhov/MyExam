package answers;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer17 {
    public static void someMethod(int count){
        int num = 0;
        while (true){
            System.out.println(num);
            num++;
            if (num >= count) return;  // выход из метода
        }
    }

    public static int otherMethod(int count){
        int num = 0;
        while (true){
            System.out.println(num);
            num++;
            if (num >= count) return num;   // выход из метода с возвратом значения типа int
        }
    }

    public static void main(String[] args) {
        someMethod(10);
        System.out.println("------------------------------");
        System.out.println(otherMethod(10));
    }
}
