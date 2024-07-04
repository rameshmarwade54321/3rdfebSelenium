package L24_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ex08_SoftAssert
{

	@Test
	public void TC1()
	{
		
		
		String act="ramesh";
		String exp="ramesh";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertNotEquals(act, exp, "failed-both results are same");
		
		Reporter.log("hello", true);
	
		boolean result=false;
		soft.assertTrue(result,"failed=result is not true");
		Reporter.log("hi", true);
		
		soft.assertAll();
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2", true);
	}
	
}
