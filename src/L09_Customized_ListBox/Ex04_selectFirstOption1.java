package L09_Customized_ListBox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Ex04_selectFirstOption1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.nobroker.in/");
		
		Thread.sleep(3000);
		
	 WebElement e1 = driver.findElement(By.xpath("//div[text()='BHK Type']"));
		
		Actions act=new Actions(driver);
		act.click(e1).perform();
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.HOME).perform();
		
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		
		
		
	}
}
