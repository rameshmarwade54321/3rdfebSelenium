package L02_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03_quitMethod 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.quit();
		
		//quit method is used to close all tabs in the  browser
	}
}
