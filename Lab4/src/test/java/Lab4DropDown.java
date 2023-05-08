import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Lab4DropDown {

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement countryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
        Select countrySelect = new Select(countryDropDown);
        List<WebElement> elements = countrySelect.getOptions();
        //countrySelect.selectByVisibleText("ANGOLA");
        //countrySelect.selectByValue("ALBANIA");
        //countrySelect.selectByIndex(5);
        for (int i = 0 ; i<elements.size();i++)
        {
            System.out.println(elements.get(i).getText());
        }
    }
}
