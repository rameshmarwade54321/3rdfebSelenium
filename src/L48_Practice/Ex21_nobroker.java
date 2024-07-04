package L48_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ex21_nobroker 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[text()='Rent']/preceding-sibling::div[text()='Buy']")).click();
		
        WebElement list = driver.findElement(By.xpath("//div[text()='BHK Type']"));
         
		Actions act=new Actions(driver);
		
	
		
		
		
		
		
	}
}
