package L49_Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		WebElement e1 = driver.findElement(By.xpath("//span[text()='Profile']"));
	
		Actions act=new Actions(driver);
		act.moveToElement(e1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
		
	}
}
