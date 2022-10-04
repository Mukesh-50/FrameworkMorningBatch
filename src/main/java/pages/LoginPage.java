package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By uname=By.id("email1");
	By pass=By.id("password1");
	By loginButton=By.className("submit-btn");
	By errorMessage=By.xpath("//h2[@class='errorMessage']");
	
	
	public void loginToApplication(String username,String password)
	{
		//driver.navigate().refresh();
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(loginButton).click();
	}
	
	
	public String getErrorMessage()
	{
		String err=driver.findElement(errorMessage).getText();
		
		return err;
	}

}
