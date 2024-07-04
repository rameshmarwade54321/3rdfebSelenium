package L08_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex02_mouseRightClickAction 
{
	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		WebElement sell = driver.findElement(By.xpath("//ul//a[text()=' Sell']"));
		
		//approch 1
		Actions act=new Actions(driver);
//		act.moveToElement(sell).perform();
//		act.contextClick().perform();
		
		//approch2
//		act.moveToElement(sell).contextClick().perform();
		
		//approch 3
		act.contextClick(sell).perform();
		
		
	}

}
