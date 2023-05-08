import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Hands_on {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/login.html");
        WebElement Email = driver.findElement(By.id("email"));
        WebElement Password = driver.findElement(By.id("passwd"));
        WebElement Sign_in = driver.findElement(By.id("SubmitLogin"));

        Email.sendKeys("ahmed@gmail.com");
        Thread.sleep(2000);
        Password.sendKeys("123456");
        Thread.sleep(2000);
        Email.clear();
        Thread.sleep(2000);
        Email.sendKeys("ashraf@gmail.com");

        Sign_in.submit();
    }
}
