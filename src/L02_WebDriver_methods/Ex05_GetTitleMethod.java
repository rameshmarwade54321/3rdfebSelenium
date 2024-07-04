package L02_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex05_GetTitleMethod
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		//System.out.println(driver.getTitle());  : we can use this  statement also instead of abv two lines
		driver.close();
	}
}
