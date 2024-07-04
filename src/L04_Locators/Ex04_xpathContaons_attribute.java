package L04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex04_xpathContaons_attribute 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// xpath by contains attribute format : //tagname[contains (@attributename,'partial attribute value')]
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abc");
		
	}
	
}
