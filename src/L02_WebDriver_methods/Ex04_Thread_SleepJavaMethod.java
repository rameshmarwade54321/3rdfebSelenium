package L02_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex04_Thread_SleepJavaMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.close();
	}
}
