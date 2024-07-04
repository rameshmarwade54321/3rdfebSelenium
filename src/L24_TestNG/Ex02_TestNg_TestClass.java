package L24_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex02_TestNg_TestClass 
{

	@Test
	public void TC1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
