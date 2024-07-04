package L24_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex03_EmailableReport 
{

	@Test
	public void TC2() //test case or test method
	{
		Reporter.log("--running TC2--",true); //className.methodname("msg")
	}
	
	@Test
	public void TC1() //test case or test method
	{
		Reporter.log("--running TC1--",true); //className.methodname("msg")
	}
}
