package L03_WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		boolean result = driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).isEnabled();
		
		System.out.println(result);
		
		if (result) 
		{
			System.out.println("element is enable");
		} 
		else 
		{
			System.out.println("element is disable");
		}
	}
}
