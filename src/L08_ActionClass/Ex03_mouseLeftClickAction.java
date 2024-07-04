package L08_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex03_mouseLeftClickAction 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		WebElement sell = driver.findElement(By.xpath("//span[@id='gh-ug-flex']/../a[text()='Sign in']"));
		
		//approch 1
		Actions act=new Actions(driver);
//		act.moveToElement(sell).perform();
//		act.click().perform();
		
		//approch2
    	//act.moveToElement(sell).click().perform();
		
		//approch 3
		act.click(sell).perform();
		
		
		
	}
}
