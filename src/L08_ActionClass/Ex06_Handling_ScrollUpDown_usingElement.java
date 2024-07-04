package L08_ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex06_Handling_ScrollUpDown_usingElement
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		
		WebElement e1 = driver.findElement(By.xpath("//h3[text()='Luxury']"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(e1).perform();
		
		
	}
}
