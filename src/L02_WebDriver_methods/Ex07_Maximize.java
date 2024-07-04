package L02_WebDriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex07_Maximize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//	    Options	s1=driver.manage();  //manage is the method of webdriver which return object of options interface
//	    Window  s2=s1.window(); //window is the method of options interface which return the object of window interface
//	             s2.maximize();  //by using object of window interface we called maximize method
//	    
	  
	}
}
