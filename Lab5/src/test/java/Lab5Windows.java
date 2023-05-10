import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class Lab5Windows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/popup.php");
        String parentWindow = driver.getWindowHandle();
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        Set<String> allWindowHandels = driver.getWindowHandles(); //2
        String newTab="";
        for (String s : allWindowHandels)
        {
            if (!parentWindow.equalsIgnoreCase(s))
                newTab = s ;
        }
        Thread.sleep(2000);
        driver.switchTo().window(newTab);
        Thread.sleep(2000);
        driver.switchTo().window(parentWindow);
    }
}
