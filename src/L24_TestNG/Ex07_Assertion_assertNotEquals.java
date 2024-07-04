package L24_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex07_Assertion_assertNotEquals 
{

	@Test
	public void TC1()
	{
		Reporter.log("hi", true);
		
		String act="ramesh";
		String exp="ramesh";
		Assert.assertNotEquals(act, exp, "failed-both results are same");
		
		//if both results are different then TC passed else failed
		//if TC pass then  failed msg will not print but if tc failed then failed msg will print
		
	}
}