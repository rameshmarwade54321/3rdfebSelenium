package L16_Exception;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_NoSuchSessionException
{

	public static void main(String[] args) 
	{
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com");
		
		driver.close();
		System.out.println( driver.getCurrentUrl());
		
	}
}
