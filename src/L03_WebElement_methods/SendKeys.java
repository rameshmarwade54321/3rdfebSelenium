package L03_WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys 
{

	public static void main(String []args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//select UN 1st approach (when we required to use that element only once 
//	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
//	   driver.findElement(By.xpath("//input[@name='email']")).clear();
//	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
		
		// select UN 2nd Approach (whenevr we required to use element for multiple time)
		  WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
	                 un.sendKeys("abc");
	                 Thread.sleep(2000);
	                 un.clear();
	                 Thread.sleep(2000);
	                 un.sendKeys("xyz");
	   
	   
	}
}
