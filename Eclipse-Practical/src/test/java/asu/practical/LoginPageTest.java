package asu.practical;

import org.testng.annotations.Test;
import org.testng.Assert;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class LoginPageTest {
	WebDriver driver ;
	LoginPage loginPage ;

  @BeforeMethod
  @Parameters("browser")
  public void setup(String browser) {
	  if(browser.equalsIgnoreCase("Edge"))
		  driver = new EdgeDriver();
	  else if (browser.equalsIgnoreCase("IE"))
		  driver = new InternetExplorerDriver();
	  loginPage = new LoginPage(driver);
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/login");
  }

  @Test
  @Parameters({"validusername","validpassword"})
  public void validLogin(String u,String p) {
	  loginPage.setUsername(u);
	  loginPage.setPassword(p);
	  loginPage.clickOnLogin();
	  String actual = loginPage.getUrl();
	  String expected = "https://the-internet.herokuapp.com/secure";
	  Assert.assertEquals(actual, expected);
	  
  }
  
  @Test
  @Parameters({"invalidusername","invalidpassword"})
  public void inValidLogin(String u,String p) {
	  loginPage.setUsername(u);
	  loginPage.setPassword(p);
	  loginPage.clickOnLogin();
	  String actual = loginPage.getUrl();
	  String expected = "https://the-internet.herokuapp.com/secure";
	  Assert.assertNotEquals(actual, expected);
	  
  }
  
  
  @AfterMethod
  public void quit() {
	  driver.quit();
  }

}
