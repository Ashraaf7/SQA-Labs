import Pages.loginPage;
import PagesFactory.loginPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginPageTestFactory {
     WebDriver driver ;
     loginPageFactory loginPageObject ;
     @BeforeMethod
     public void setDriver()
     {
      driver = new EdgeDriver();
      driver.manage().window().maximize();
      driver.get("https://the-internet.herokuapp.com/login");
     }

     @Test
     public void validLogin()
     {
          loginPageObject = new loginPageFactory(driver);
          loginPageObject.enterUsername("tomsmith");
          loginPageObject.enterPassword("SuperSecretPassword!");
          loginPageObject.clickOnLoginButton();
         Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
     }
     @Test
     public void invalidLogin()
     {
      loginPageObject = new loginPageFactory(driver);
      loginPageObject.enterUsername("ahmed");
      loginPageObject.enterPassword("123456!");
      loginPageObject.clickOnLoginButton();
      Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");
     }

     @AfterMethod
 public void quit()
     {
      driver.quit();
     }
}
