package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex18_flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
	WebElement s1 = driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]"));
		
		s1.sendKeys("iphone");
		s1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//	String s=driver.getCurrentUrl();
	
		//Thread.sleep(5000);
		//driver.navigate().to(s);
		Thread.sleep(5000);	
	WebElement s3 = driver.findElement(By.xpath("//input[@class='zDPmFV']"));
		//s3.sendKeys(Keys.DELETE);
		s3.clear();
		s3.sendKeys("iphone15");
		Thread.sleep(2000);
		s3.sendKeys(Keys.ENTER);
		
		
	}
}
