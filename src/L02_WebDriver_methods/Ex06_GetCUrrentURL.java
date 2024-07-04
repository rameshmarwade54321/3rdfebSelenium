package L02_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex06_GetCUrrentURL 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.getCurrentUrl();
		String url = driver.getCurrentUrl();
		System.out.println(url);
	//	System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}
}
