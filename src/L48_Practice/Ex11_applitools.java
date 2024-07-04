package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex11_applitools 
{

	public static void main(String []args) throws InterruptedException
	{
		//open website
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.applitools.com/");  
		
		Thread.sleep(2000);
		//maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//xpath for test field username
		driver.findElement(By.xpath("//input[@placeholder='Enter your username']")).sendKeys("abc");
		
		Thread.sleep(2000);
		//xpath for test field password (
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("123");
		
		//select checkbox
		//xpath for checkboc (xpath by attribute)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
		
		Thread.sleep(2000);
		//xpath for test field click signin link (xpath by text)
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//click on twitter icon
		//xpath for twitter icon(xpath by contains attribute)
		//this image link is not working in application
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//img[@src='img/social-icons/twitter.png']")).click();
		
		
	}
}
