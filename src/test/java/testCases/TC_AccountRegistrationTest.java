package testCases;

import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_AccountRegistrationTest extends BaseClass {

	
	@Test
	public void verify_account_registration()
	{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		regpage.setFirstName(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
//		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
//		String pswd=randomAlphaNumeric();
//		regpage.setPassword(pswd);
//		regpage.setconfirmPassword(pwsd);
//		String confmsg=regpage.getConfirmationMsg();
//		Assert.assertEquals(confmsg, "Your Account Has Been Created");
		
	}		
}

