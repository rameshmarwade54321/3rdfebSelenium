package L02_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02_CloseMethod 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
			driver.close();
			
			
			// close method is used to close the current tab from browser
	}
}
