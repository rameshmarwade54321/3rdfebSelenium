package L24_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex13_multiBrowserTesting 
{

	@Parameters("BrowserName")
	@Test
	public void login(String BrowserName) throws InterruptedException
	{
		WebDriver driver=null;
		if(BrowserName.equals("chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(BrowserName.equals("edge"))
		{
			driver =new EdgeDriver();
		}
		else if(BrowserName.equals("firefox"))
		{
			driver =new FirefoxDriver();
		}
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(2000);
	
		String acttext = driver.findElement(By.xpath("//div[text()='Swag Labs']")).getText();
		String exptext = "Swag Labs";
		
		if(acttext.equals(exptext))
		{
			System.out.println("TS pass");
		}
		else
		{
			System.out.println("TS fail");
		}
		
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
}
