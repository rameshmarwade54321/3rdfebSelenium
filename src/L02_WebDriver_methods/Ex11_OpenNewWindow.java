package L02_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.jvm.Target;

public class Ex11_OpenNewWindow 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		
		
		//how the above switchTo statement work mentioned below
//		TargetLocator t=driver.switchTo();
//		t.newWindow(WindowType.TAB);
//		driver.navigate().to("https://www.google.com");
//		
	
		
	}
}
