package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/pune");
		
		Thread.sleep(2000);
		
		WebElement s1 = driver.findElement(By.xpath("//div[@class='sc-133848s-3 sc-133848s-10 dOuCBq']/descendant::div[text()='MahaLaxmi Lawns: Karve Nagar, Pune'][1]"));
		
		Thread.sleep(10000);
		s1.click();
	
	
	
	}
	
}
