package PagesFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class loginPageFactory {
    private WebDriver driver ;
    public loginPageFactory(WebDriver driver){
        this.driver = driver ;
        AjaxElementLocatorFactory ajax = new AjaxElementLocatorFactory(driver,100);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "username")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password ;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    public void enterUsername (String username)
    {
        userName.sendKeys(username);
    }

    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }


    public void clickOnLoginButton()
    {
        loginButton.click();
    }
}
