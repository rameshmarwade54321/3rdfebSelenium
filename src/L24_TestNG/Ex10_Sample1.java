package L24_TestNG;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex10_Sample1 
{

	@Test
	public void TC1()
	{
		Assert.assertEquals("hello", "hello","Failed=results mismatched");
	}
	
	
	@Test
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
