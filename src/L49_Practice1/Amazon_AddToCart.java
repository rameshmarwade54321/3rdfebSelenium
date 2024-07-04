package L49_Practice1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AddToCart 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15");
		
		Thread.sleep(4000);
		
		List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		
		String exp="15 plus";
		
		for( WebElement s1 : alloptions)
		{
		   String text = s1.getText();
		   if(text.contains(exp))
		   {
			   s1.click();
			   break;
		   }
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-index='3']/descendant::span[contains(text(),'iPhone 15 Plus (128 GB)')]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> ar1=new ArrayList<String>(ids);
		
		driver.switchTo().window(ar1.get(1));
		
		
		driver.findElement(By.xpath("//div[@id='desktop_qualifiedBuyBox']//input[@title='Add to Shopping Cart']")).click();
		
		
	}
}
