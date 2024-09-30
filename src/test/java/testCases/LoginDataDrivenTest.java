//package testCases;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import pageObjects.HomePage;
//import pageObjects.LoginPage;
//import pageObjects.MyAccountPage;
//import testBase.BaseClass;
//import utilities.DataProviders;
//
//public class LoginDataDrivenTest extends BaseClass {
//
//	/*
//	 Data is valid - login success - test pass - logout
//	 Data is valid - login failed - test fail
//	 
//	 Data is invalid - login success - test fail - logout
//	 Data is invalid - login failed - test pass
//	 */
//	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class, groups="DataDriven") //to provide the data from dataprovider class or different class
//	public void verify_loginDDT(String email, String password, String ExpectedOutput)
//	{
//		logger.info("********* Starting TC_LoginDTTTest **********");
//		
//		try
//		{
//		HomePage hp = new HomePage(driver);
//		hp.clickMyAccount();
//		hp.clickLogin();
//		
//		LoginPage lp = new LoginPage(driver);
//		lp.setEmail(email);
//		lp.setPassword(password);
//		lp.clickLogin();
//		
//		//MyAccount
//		MyAccountPage macc = new MyAccountPage(driver);
//		boolean targetPage=macc.isMyAccountExists();
//		Assert.assertTrue(targetPage);
//		
//		if(ExpectedOutput.equalsIgnoreCase("valid"))
//		{
//			if(targetPage==true)
//			{
//			macc.clickLogout();	
//			Assert.assertTrue(true);
//			}
//			else
//			{
//			Assert.assertTrue(false);
//			}
//		}
//		if(ExpectedOutput.equalsIgnoreCase("invalid"))
//		{
//			if(targetPage==true)
//			{
//			macc.clickLogout();	
//			Assert.assertTrue(false);
//			}
//			else
//			{
//			Assert.assertTrue(true);
//			}
//		}
//		}
//		catch (Exception e)
//		{
//			Assert.fail();
//		}
//		logger.info("********* Finished TC_LoginDDTTest **********");		
//	}
//}
