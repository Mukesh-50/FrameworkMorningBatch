package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	// Third way to capture in base64 format
	public static String captureScreenshotAsBase64(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		String base64=ts.getScreenshotAs(OutputType.BASE64);
	
		return base64;
		
	}


}
