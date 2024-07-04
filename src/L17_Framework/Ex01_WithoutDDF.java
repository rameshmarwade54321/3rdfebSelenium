package L17_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_WithoutDDF 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//enter username
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
			Thread.sleep(2000);
		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		//click login
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(2000);
		//get header text to validate test case
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
		
		//click on open menu
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(2000);
		//click on log out
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		
		
		
	}
}
