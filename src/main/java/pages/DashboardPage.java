package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage 
{
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By logoutButton=By.xpath("//button[text()='Sign out']");
	
	
	public boolean isLogoutDisplayed()
	{
		boolean status= driver.findElement(logoutButton).isDisplayed();
		
		return status;
	}
	
	public void clickOnLogoutButton()
	{
		driver.findElement(logoutButton).click();
	}

}
