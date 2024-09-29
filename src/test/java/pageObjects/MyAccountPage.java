package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement msgHeading;
	
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]")
	WebElement lnkLogout;
	
	public boolean isMyAccountExists()
	{
		try
		{
			return(msgHeading.isDisplayed());
		}
		catch (Exception e)
		{
			return false;
		}
	}

	public void clickLogout()
	{
		lnkLogout.click();
	}
}
