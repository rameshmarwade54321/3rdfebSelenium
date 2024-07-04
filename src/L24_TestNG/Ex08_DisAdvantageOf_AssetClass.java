package L24_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex08_DisAdvantageOf_AssetClass
{

	@Test
	public void TC1()
	{
		
		
		String act="ramesh";
		String exp="ramesh";
		Assert.assertNotEquals(act, exp, "failed-both results are same");
		
		Reporter.log("hello", true);
		
		boolean result=true;
		Assert.assertTrue(result,"failed=result is not true");
		Reporter.log("hi", true);
		
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2", true);
	}
	
	
	//if multiple assertion available in test method then if one of the verification is failed then 
	//remaining verification will not execute and test ng will run next test method
	//to overcome this drawback we used softAssert class
}