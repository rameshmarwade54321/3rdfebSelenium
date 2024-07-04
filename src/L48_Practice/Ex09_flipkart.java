package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex09_flipkart 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		
		
		driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']")).click();
		
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9209646387");
	
		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
	}
}
