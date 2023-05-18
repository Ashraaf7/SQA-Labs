package asu.practical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver ; 
	
	public LoginPage (WebDriver driver )
	{
		this.driver= driver ;
	}

	By userName = By.id("username") ;
	By password = By.id("password") ;
	By loginButton = By.xpath("//button[@type= 'submit']") ;
		
	public void setUsername(String user) {
		driver.findElement(userName).sendKeys(user);
	}
	
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLogin() {
		driver.findElement(loginButton).click();;

}
	public String getUrl() {
		return driver.getCurrentUrl();
		
	}
}
