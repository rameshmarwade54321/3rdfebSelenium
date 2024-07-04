package L48_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ex01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(2000);
		driver.getTitle();
		
		String title =driver.getTitle();
		System.out.println(driver.getTitle());
		
	    String url=driver.getCurrentUrl();
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();

//		Options s1=driver.manage();
//		 Window s2 =s1.window();
//		 s2.maximize();
		 Thread.sleep(2000);
		 driver.manage().window().minimize();
		 Thread.sleep(2000);
		 driver.manage().window().fullscreen();
		 driver.navigate().to("https://www.amazon.in");
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.navigate().refresh();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
