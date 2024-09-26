package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

public AccountRegistrationPage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//*[@id='input-firstname']")
WebElement txtFirstname;
@FindBy(xpath="//*[@id='input-lastname']")
WebElement txtLastname;
@FindBy(xpath="//*[@name='agree']")
WebElement chkdPolicy;
@FindBy(xpath="//*[@value='Continue']")
WebElement btnContinue;
//@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created']")
//WebElement msgConfirmation;

public void setFirstName(String fname)
{
	txtFirstname.sendKeys(fname);
}

public void setLastName(String lname)
{
	txtLastname.sendKeys(lname);
}

public void setPrivacyPolicy()
{
	chkdPolicy.click();
}

public void clickContinue()
{
	btnContinue.click();
}

/*public String getConfirmationMsg(){
	try {
		return(msgConfirmation.getText());
	} 
	catch (Exception e)
	{
		return(e.getMessage());
	} */
}
//}
