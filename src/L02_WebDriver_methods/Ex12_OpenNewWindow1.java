package L02_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex12_OpenNewWindow1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com");
	 Thread.sleep(3000);
	 
	 driver.switchTo().newWindow(WindowType.WINDOW);
	 driver.get("https://www.amazon.in");
	 
	 
	}
}
