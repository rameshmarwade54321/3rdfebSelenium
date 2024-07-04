package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex16 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//get text of log in button
		String value = driver.findElement(By.xpath("//button[text()='Log in']")).getText();
		
		System.out.println(value);
		
		
		//get attribute of name field
	  WebElement value1 = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	    
	   value1.sendKeys("abc");
	    String value2 = value1.getAttribute("value");
	    String value3= value1.getAttribute("placeholder");
	    
	 System.out.println(value2);
	 System.out.println(value3);
	
	
	}
}
