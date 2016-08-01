package answers;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Parent {
    public final int CONST = 0;
    private int privteVar = 1;
    protected int protectedVar = 2;

    public void someMethod(){
        System.out.println("It's parent");
    }

    public Parent(int privateVar){
        this.privteVar = privateVar;
    }

    public Parent(int privateVar, int protectedVar){
        this.privteVar = privateVar;
        this.protectedVar = protectedVar;
    }

    public static void main(String[] args) {
        Parent p1 = new Parent(0);
        Parent p2 = new Parent(1, 2);
    }
}
