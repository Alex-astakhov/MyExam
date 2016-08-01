package answers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer20 {
    static String getStringFromConsol() throws IOException {            // в данном случае исключение не обрабатывается,
                                                            // а просто выбрасывается в вызывающий код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    public static void main(String[] args) {
        try {                           // обработка исключения
            getStringFromConsol();     // блок, в котором может возникнуть исключение
        } catch (IOException e) { // блок, выполняющийся в случае возникновения исключения IOException
            e.printStackTrace();       // catch могут быть вложенными, если в блоке try могут возникнуть разные типы исключений
        }
        finally {
            System.out.println("OK");   // блок, выполняющийся в любом случае
        }
    }
}
