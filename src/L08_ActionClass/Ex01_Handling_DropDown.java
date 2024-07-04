package L08_ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex01_Handling_DropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		//find out target element
		WebElement ebay = driver.findElement(By.xpath("//a[text()='My eBay']"));
		
		//create object for actions class and pass driver(object of webdriver)
		Actions act=new Actions(driver);
		
		act.moveToElement(ebay).perform();
		
		Thread.sleep(2000);
		//click on watchlist in dropdwon
		driver.findElement(By.xpath("//a[text()=' Watchlist']")).click();
		
		
	}
}
