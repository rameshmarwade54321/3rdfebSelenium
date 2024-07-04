package L48_Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex19_flipkart1 
{
	public static void main(String[] args) throws InterruptedException 
		{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
	WebElement s1 = driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]"));
		
		s1.sendKeys("iphone");
		s1.sendKeys(Keys.ENTER);
	Thread.sleep(2000);

		Thread.sleep(5000);	
	WebElement s3 = driver.findElement(By.xpath("//input[@class='zDPmFV']"));
		
		s3.clear();
		s3.sendKeys("iphone15");
		Thread.sleep(2000);
		s3.sendKeys(Keys.ENTER);
		Thread.sleep(4000);	
		
	driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
		
	
		}
	}



