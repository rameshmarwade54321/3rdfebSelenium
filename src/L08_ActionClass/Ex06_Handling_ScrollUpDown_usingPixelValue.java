package L08_ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.management.VMOption.Origin;

public class Ex06_Handling_ScrollUpDown_usingPixelValue
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		//scroll up-down
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		act.scrollByAmount(0, -300).perform();
		
	
		
		//scroll left-right
//		act.scrollByAmount(630, 0).perform();
//		Thread.sleep(2000);
//		act.scrollByAmount(-350, 0).perform();

	}
}
