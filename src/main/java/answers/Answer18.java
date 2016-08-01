package answers;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer18 {
    public static void main(String[] args) {
        int nums = 10;
        int index = 0;
        for (int i = 0; i < nums; i++){
            System.out.println(fibonacci(index));
            index++;
        }
    }

    public static long fibonacci(int i){
        if (i == 0) return 0;
        if (i <= 2) return 1;
        long fibterm = fibonacci(i - 1) + fibonacci(i - 2);
        return fibterm;
    }

}
