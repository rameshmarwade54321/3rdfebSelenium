package L08_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex04_mouseDoubleClickAction 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
//		act.moveToElement(element).perform();
//		act.doubleClick().perform();
//		
//		act.moveToElement(element).doubleClick().perform();
		
		act.doubleClick(element).perform();
		
		//driver.switchTo().alert().accept();
		
		
	}
}
