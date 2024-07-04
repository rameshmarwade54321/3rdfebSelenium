package L24_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex11_Sample1 
{

	@Test(groups="login")
	public void TC1()
	{
		Reporter.log("--run TC1-- ",true);
	}
	
	@Test(groups="profile")
	public void TC2()
	{
		Reporter.log("--run TC2-- ",true);
	}
	
	@Test(groups="setting")
	public void TC3()
	{
		Reporter.log("--run TC3-- ",true);
	}
	
	
	@Test(groups="fund")
	public void TC4()
	{
		Reporter.log("--run TC4-- ",true);
	}
}
