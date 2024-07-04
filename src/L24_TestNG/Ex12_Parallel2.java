package L24_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex12_Parallel2
{

	@Test
	public void openFacebookApp() throws InterruptedException
	{
		Reporter.log("--open facebook App--",true);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.quit();
	}
}
