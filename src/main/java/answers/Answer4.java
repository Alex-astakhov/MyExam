package answers;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer4 {
    public int nonStaticVar;
    public static int staticVar;

    public static void main(String[] args) {
        Answer4 answ1 = new Answer4();
        Answer4 answ2 = new Answer4();

        answ1.nonStaticVar = 1;
        answ2.nonStaticVar = 2;
        System.out.println("answ1: " + answ1.nonStaticVar + ", " + "answ2: " + answ2.nonStaticVar);
        // у переменных в разных объектах - разные значения


        answ1.staticVar = 5;
        answ2.staticVar = 6;
        System.out.println("answ1: " + answ1.staticVar + ", " + "answ2: " + answ2.staticVar);
        // оба объекта физически обращаются к одной и той же переменной
    }
}
