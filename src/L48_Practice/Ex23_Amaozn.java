package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex23_Amaozn 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		
	//	WebElement s1 = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		
		WebElement e1 = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(e1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();
		
//		s1.sendKeys("mobiles");
//		s1.sendKeys(Keys.ENTER);
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//span[text()='Samsung']")).click();
	}
}
