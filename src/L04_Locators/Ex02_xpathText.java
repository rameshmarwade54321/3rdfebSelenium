package L04_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02_xpathText 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// xpath by text format : //tagname[text()='complete text value']
		
		//xpath for forget password
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}
}
