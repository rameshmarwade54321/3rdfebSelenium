package L24_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex07_Assertion_assertFalse
{

	@Test
	public void TC1()
	{
		Reporter.log("hi", true);
		
		boolean result = false;
		Assert.assertFalse(result, "failed-result is not false");
		
		//if condition is false then TC passed else failed
		//if TC pass then  failed msg will not print but if tc failed then failed msg will print
		
	}
}