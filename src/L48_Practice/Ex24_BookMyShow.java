package L48_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex24_BookMyShow 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		Thread.sleep(20000);
		Actions act =new Actions(driver);
		
		WebElement e1 = driver.findElement(By.xpath("//div[text()='Kailash Kher Live in Concert']"));
		
		e1.click();
		System.out.println("hi");
	}
}
