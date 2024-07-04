package L24_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex11_Sample2
{

	
	
	@Test(groups="profile")
	public void TC5()
	{
		Reporter.log("--run TC5-- ",true);
	}
	
	@Test(groups="setting")
	public void TC6()
	{
		Reporter.log("--run TC6-- ",true);
	}
	
	@Test(groups="fund")
	public void TC7()
	{
		Reporter.log("--run TC7-- ",true);
	}
	
	
	@Test(groups="logout")
	public void TC8()
	{
		Reporter.log("--run TC8-- ",true);
	}
}
