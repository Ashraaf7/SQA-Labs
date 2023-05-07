import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {

    //Lab2

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://duckduckgo.com/");
        driver.findElement(By.id("search_form_input_homepage")).sendKeys("Mohamed Salah");
        driver.findElement(By.id("search_button_homepage")).click();
        driver.quit();

    }
}
