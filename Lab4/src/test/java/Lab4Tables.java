import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Lab4Tables {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/write-xpath-table.html");
        WebElement table = driver.findElement(By.xpath("//table[@border='l']/tbody/tr[2]/td[1]"));
        System.out.println(table.getText());
    }
}
