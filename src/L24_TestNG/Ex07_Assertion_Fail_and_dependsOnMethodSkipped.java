package L24_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex07_Assertion_Fail_and_dependsOnMethodSkipped
{

	@Test
	public void TC1()
	{
		Assert.fail();
		Reporter.log("hi", true);	
	
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("hello", true);	
	}
	
	@Test(dependsOnMethods="TC1")
	public void TC3()
	{
		Reporter.log("hello", true);	
	}
	
	//if we used fail method of asset in test method then that method failed during execution
	//in a test class if any method fail then remaining method execution will continue but
	//if any other method depends on failed method then that method execution will be skipped
	
}