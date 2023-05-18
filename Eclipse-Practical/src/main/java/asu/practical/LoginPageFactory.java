package asu.practical;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPageFactory {
	private WebDriver driver ; 
	
	public LoginPageFactory (WebDriver driver )
	{
		this.driver= driver ;
		AjaxElementLocatorFactory ajaxElementLocatorFactory = new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(ajaxElementLocatorFactory, this);
	}

	@FindBy(id = "username")
	WebElement userName ;
	
	@FindBy(id = "password")
	WebElement password ;
	
	@FindBy(xpath = "//button[@type= 'submit']")
	WebElement loginButton ;
		
	public void setUsername(String user) {
		userName.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		loginButton.click();

}
}
