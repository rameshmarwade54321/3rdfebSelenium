package L24_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex05_Keyword4_Timeout 
{

	@Test(timeOut=5000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(4000);
		Reporter.log("--running TC1---",true);
	}
}
