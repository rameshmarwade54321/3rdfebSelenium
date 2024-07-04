package L24_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex06_Testsuit_Sample1 
{

	@Test
	public void TC1()
	{
		Reporter.log("--runnning TC1---", true);
	}
	
	
	@Test
	public void TC2()
	{
		Reporter.log("--runnning TC2---", true);
	}
	
	
	@Test
	public void TC3()
	{
		Reporter.log("--runnning TC3---", true);
	}
}
