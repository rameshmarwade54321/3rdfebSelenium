package L02_WebDriver_methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex13_getPosition_getSize 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		
		Dimension d=new Dimension(600, 600);
		driver.manage().window().setSize(d);
		
		Point p=new Point(200,200);
		driver.manage().window().setPosition(p);
		
		//driver.manage().window().maximize();
		
		Dimension d1=driver.manage().window().getSize();
		System.out.println(d1);
		//System.out.println(driver.manage().window().getSize());
		
		Point p1=driver.manage().window().getPosition();
		System.out.println(p1);
		//System.out.println(driver.manage().window().getPosition());
		
		
	}
}
