package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex07_madhavbaug 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://madhavbaug.org/");
		
		driver.findElement(By.xpath("//a[@title='My account']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rameshm");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//div[@class='login-form-side wd-side-hidden wd-right wd-opened']"));
	
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
