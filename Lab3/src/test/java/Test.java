import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        /*
        WebElement userName = driver.findElement(By.id("username"));
        if(userName.isDisplayed())//true or false
        {
            userName.sendKeys("tomsmith");
        }
        Thread.sleep(3000);
        userName.clear();
        System.out.println(userName.isEnabled());
        System.out.println(userName.getLocation()); */
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        System.out.println(checkBox.isSelected()) ;//true or false
        checkBox.click();

    }

}
