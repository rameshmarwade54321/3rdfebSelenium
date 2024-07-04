package L24_TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex09_DisableTestMethod_TestClass 
{

	@Test
	public void TC1()
	{
		Reporter.log("TC1",true);
	}
	
	
	@Test (enabled=false)
	public void TC2()
	{
		Reporter.log("TC2",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("TC3",true);
	}
}
