package testCases;

import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_AccountRegistrationTest extends BaseClass {

	
	@Test(groups={"Regression","Master"})
	public void verify_account_registration()
	{
		logger.info("**** startting TC_AccountRegistrationTest ****");
		
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
//		Try {
//		Assert.assertEquals(confmsg, "Your Account Has Been Created");
//	}
//	catch {
//		logger.error("test failed");
//	}
		
		logger.info(" **** Finished TC_AccountRegistrationTest ****");
	}		
}

