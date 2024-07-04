package L24_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex05_Keyword2_EnableFalse 
{

	@Test 
	public void TC1()
	{
		Reporter.log("---running TC1----",true);
	}
	
	@Test(enabled=false)
	public void TC2()
	{
		Reporter.log("---running TC2----",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("---running TC3----",true);
	}
}
