package testcases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({listeners.ListenerDemo.class})
public class RawaDemo {

	
	@Test
	public void rawa()
	{
		Assert.assertTrue(false);
		System.out.println("Test 1 Executed");
	}
	

	@Test
	public void bushra()
	{
		Assert.assertTrue(false);
		System.out.println("Test 2 Executed");
	}
	
	@Test
	public void omer()
	{
		System.out.println("Test 3 Executed");
	}
	
	
}
