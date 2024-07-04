package L04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03_xpathContains_text 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// xpath by contains text format : //tagname[contains (text(),'partial test value')]
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	}
}
