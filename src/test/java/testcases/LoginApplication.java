package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import dataProviders.ExcelUtility;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginApplication extends BaseClass
{
	LoginPage login;
	DashboardPage dash;
	
	@Test(dataProvider = "Users")
	public void loginApp(String uname,String pass)
	{
		
			login=new LoginPage(driver);
			
			login.loginToApplication(uname, pass);
			
			dash=new DashboardPage(driver);
		
			boolean status=dash.isLogoutDisplayed();
			
			Assert.assertTrue(status);
			
			dash.clickOnLogoutButton();

	}
	
	@Test
	public void loginAppWithInvalidCredentials()
	{
		
			login.loginToApplication("ineuron@ineuron.ai", "rawa");
			
			String errorMessage=login.getErrorMessage();
						
			Assert.assertTrue(errorMessage.contains("Email and Password Doesn't match"));

	}
	
	
	@DataProvider(name="Users")
	public Object[][] getData()
	{
		Object[][] arr=ExcelUtility.getDataFromSheet("Users");
		
		return arr;
	}
	
	
	
	
	
	
	
	
	// Add 3 more TC
	
		// TC3 - If we dont enter any details - capture msg and validate
		// TC4 - If we dont enter any pass - capture msg and validate
		// TC5 - If we dont enter any username but enter the pass - capture msg and validate

		
	

	
	
	
}
