package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
	
	public static ExtentReports extent;
	
	
	public static ExtentReports getInstance()
	{
		
		if(extent==null)
		{
			System.out.println("LOG:INFO - No Report Object Found - Creating Report Object");
			extent=createInstance();
			return extent;
		}
		else
		{
			System.out.println("LOG:INFO - Report Object Found - Reusing existing Object");
			return extent;
		}
		
	}
	
	public static ExtentReports createInstance()
	{
		// append date time with report
		ExtentSparkReporter htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/Automation.html");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setReportName("Automation Report");
		htmlReporter.config().setDocumentTitle("Sprint Report");
		

		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		return extent;
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
