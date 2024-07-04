package L24_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex06_TestSuit_Sample2 
{

	@Test
	public void TC4()
	{
		Reporter.log("--runnning TC4---", true);
	}
	
	
	@Test
	public void TC5()
	{
		Reporter.log("--runnning TC5---", true);
	}
	
	
	@Test
	public void TC6()
	{
		Reporter.log("--runnning TC6---", true);
	}
}
