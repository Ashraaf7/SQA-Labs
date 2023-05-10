import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab5Alerts {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement CustomerId = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
        CustomerId.sendKeys("10");
        submitButton.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.accept();

    }
}
