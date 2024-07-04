package L04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_xpathAttribute 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
// xpath by attribute format : //tagname[@attribute name='complete attribute value']
		//xpath for input email field
		driver.findElement(By.xpath("//input [@id='email']")).sendKeys("ramesh123");
		
		//xpath for password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ramesh@123");
		
		//xpath for login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	
	}
}
