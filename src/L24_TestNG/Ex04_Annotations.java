package L24_TestNG;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Ex04_Annotations 
{

	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("---open Browser----",true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("---login to app----",true);
	}
	
	@Test
	public void TC1()
	{
		Reporter.log("---running TC1----",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("---running TC2----",true);
	}
	
	@AfterMethod
	public void logoutToApp()
	{
		Reporter.log("---logout To App----",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("---close Browser----",true);
	}
	
}
