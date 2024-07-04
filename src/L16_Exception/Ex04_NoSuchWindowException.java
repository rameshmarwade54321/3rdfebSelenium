package L16_Exception;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex04_NoSuchWindowException
{

	
	//close browser manually after url enter
	
	public static void main(String[] args) throws InterruptedException 
	{
	
WebDriver driver=new ChromeDriver();
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter flipkart URL
		driver.get("https://www.flipkart.com/");
		
		
		
		// mouse over action on login then will get sign up option so store login path
		WebElement login = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		
		//create object for action class
		Actions act=new Actions(driver);
		
		//perform action on login tab
		act.moveToElement(login).perform();
		
		//click on signup
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		
		
		
		
		
	}
}
