import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

/**
 * Created by Alex Astakhov on 01.08.2016.
 */
public class Answer27 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void first() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://kismia.com");
        String mainWindow = driver.getWindowHandle();

        driver.findElement(By.cssSelector(".mailru.in_popup")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> windowHandles = driver.getWindowHandles();
        for (String window: windowHandles){
            if (!window.equals(mainWindow))
                driver.switchTo().window(window);
        }
        driver.switchTo().window(mainWindow);

    }


}
