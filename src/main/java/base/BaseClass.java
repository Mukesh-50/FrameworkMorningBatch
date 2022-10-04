package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import browserFactory.BrowserFactory;
import dataProviders.ConfigUtility;

public class BaseClass 
{

	public WebDriver driver;

	
	@BeforeClass
	public void setupBrowser()
	{
		driver=BrowserFactory.startBrowser(ConfigUtility.getValue("browser"), ConfigUtility.getValue("appURL"));
	
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	
}
