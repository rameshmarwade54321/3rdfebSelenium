package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Ex03 
{
	public static void main(String[] args)  
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		
		driver.findElement(By.xpath("//a[@data-action='sign in']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chat.ramesh@gmail.com");
	
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
	  
	   
	     
	     
	}
}
