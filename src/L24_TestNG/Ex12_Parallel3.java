package L24_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex12_Parallel3
{
	

	@Test
	public void openfacebookApp() throws InterruptedException
	{
		Reporter.log("--open Flipkart App--",true);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Flipkart.com");
		Thread.sleep(2000);
		driver.quit();
	}
}
