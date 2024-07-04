package L49_Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit_click 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//find xpath for search text box and then provide input then submit
		WebElement a1 = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		a1.sendKeys("iphone");
		a1.submit();   //worked
		//a1.click();     //not worked 
		
		
		/* find xpath for search text box then provide input then 
		search xpath for search icon then click or submit	*/	
		
		
		//driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		
		//driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		//driver.findElement(By.xpath("//button[@class='_2iLD__']")).submit();
	}
}
