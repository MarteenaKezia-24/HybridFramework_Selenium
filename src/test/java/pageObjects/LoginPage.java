package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//*[@id='input-email']")
	WebElement txtEmailAddress;
	@FindBy(xpath="//*[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath="//*[@class='btn btn-primary']")
	WebElement btnLogin;

	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void clickLogin()
	{
		btnLogin.click();;
	}
}


