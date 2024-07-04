package L24_TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex07_Assertion_assertNull
{

	@Test
	public void TC1()
	{
		Reporter.log("hi", true);
		
		String str[]= {"ramesh",null};
		Assert.assertNull(str[1], "failed-result is not Null");
		
		//if component is Null then TC passed else failed
		//if TC pass then  failed msg will not print but if tc failed then failed msg will print
		
	}
}