package L49_Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FacebookLoginError1
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9209646387");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ghsakhgasf");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ghsakhgasf");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(10000);
		
		boolean result = driver.findElement(By.xpath("//div[@class='_9ay7']")).isDisplayed();
		System.out.println(result);
		
		
		if(result)
		{
			System.out.println("error msg visible");
		}
		else
			
		{
			System.out.println("error msg not visible");
		}
		
		
	}
}
