import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer26 {

    @DataProvider(name = "nums")
    public static Object[][] nums(){
        return new Object[][]{
                {1},
                {2},
                {3},
                {4},
        };
    }

    @Test(dataProvider = "nums")
    public void printNums(int num){
        System.out.println(num);
    }
}
