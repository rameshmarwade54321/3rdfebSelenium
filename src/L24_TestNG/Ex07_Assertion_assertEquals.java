package L24_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex07_Assertion_assertEquals 
{

	@Test
	public void TC1()
	{
		Reporter.log("hi", true);
		
		String act="ramesh";
		String exp="ramesh";
		Assert.assertEquals(act, exp, "failed-both results are different");
	
		
		//if both result are equal then passed else failed
		//if TC pass then faile failed msg will not print but if tc failed then faiuled msg will print
		
	}
}