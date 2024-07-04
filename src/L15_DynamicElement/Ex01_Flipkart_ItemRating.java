package L15_DynamicElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_Flipkart_ItemRating 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("samsanug a23");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		String text = driver.findElement(By.xpath("((//div[@class='_75nlfW'])[1]//span)[6]")).getText();
	
		System.out.println(text);
	}
}
