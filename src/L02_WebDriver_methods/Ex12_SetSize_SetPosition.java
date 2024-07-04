package L02_WebDriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.internal.Finalizer;

public class Ex12_SetSize_SetPosition
{
	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com");
	 Thread.sleep(3000);
	 
	 driver.switchTo().newWindow(WindowType.WINDOW);
	 driver.get("https://www.amazon.in");
	 
	 Thread.sleep(3000);
	 Dimension d=new Dimension(100, 320);
	 driver.manage().window().setSize(d);
	
	 Thread.sleep(3000);
	 Point p=new Point(100,200);
	 driver.manage().window().setPosition(p);
	
	
	}
}
