package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    private WebDriver driver ;
    public loginPage(WebDriver driver){
        this.driver = driver ;
    }

    By userName = By.id("username");
    By password = By.id("password");
    By loginButton = By.xpath("//button[@type='submit']");

    public void enterUsername (String username)
    {
        driver.findElement(userName).sendKeys(username);
    }

    public void enterPassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }


    public void clickOnLoginButton()
    {
        driver.findElement(loginButton).click();
    }
}
