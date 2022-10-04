package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener
{
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Passed "+result.getMethod().getMethodName());
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed "+result.getMethod().getMethodName());
		System.out.println("Exception thrown by this method "+result.getThrowable().getMessage());
		
	}
	
	/*
	 * 	1- Setup Report
	 *  2 - Add the test
	 *  3-  Add logs
	 *  4-  flush  
	 * 
	 * 
	 * 
	 */

}
