package L24_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex12_Parallel1 
{

	@Test
	public void openGoogleApp() throws InterruptedException
	{
		Reporter.log("--open Google App--",true);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.quit();
	}
}
