package L02_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex09_Fullscreen 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
	}
}
