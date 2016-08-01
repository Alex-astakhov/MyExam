package answers;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer1 extends Parent {

    public Answer1(int superVar){  // пример для вопроса 8. Вызывается конструктор родительского класса
        super(superVar);
        System.out.println(super.CONST); // пример для вопроса 8. Обращение к константе непосредственно класса-родителя
    }

    public int getSum(int a, int b){
        return a + b;
    }

    public String getSum(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        Answer1 answer1 = new Answer1(0);
        System.out.println(answer1.getSum(1, 2 ));     // пример полиморфизма
        System.out.println(answer1.getSum("1", "2"));  // пример полиморфизма

        System.out.println(answer1.CONST);   // пример наследования
        System.out.println(answer1.protectedVar);

        Parent parent = new Parent(0);
       // System.out.println(parent.privateMethod);// пример инкапсуляции - мы не можем обратиться к скрытому методу
                                                // класса Parent из другого класса

    }

}
