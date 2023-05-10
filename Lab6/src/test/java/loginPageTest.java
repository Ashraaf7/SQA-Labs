import Pages.loginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class loginPageTest {
     WebDriver driver ;
     loginPage loginPageObject ;
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
          loginPageObject = new loginPage(driver);
          loginPageObject.enterUsername("tomsmith");
          loginPageObject.enterPassword("SuperSecretPassword!");
          loginPageObject.clickOnLoginButton();
         Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");
     }
     @Test
     public void invalidLogin()
     {
      loginPageObject = new loginPage(driver);
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
