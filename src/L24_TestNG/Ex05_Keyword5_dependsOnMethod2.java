package L24_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex05_Keyword5_dependsOnMethod2 
{

	@Test
	public void login1()
	{
		Reporter.log("---Running login1----", true);
	}
	
	@Test
	public void login2()
	{
		Reporter.log("---Running login2----", true);
	}
	
	@Test(dependsOnMethods= {"login1","login2"})
	public void logout()
	{
		Reporter.log("---Running logout----", true);
	}
}
