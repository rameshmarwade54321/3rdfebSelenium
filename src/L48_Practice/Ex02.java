package L48_Practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.myntra.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		driver.get("https://www.redbus.in");
		Thread.sleep(1000);
		Dimension d=new Dimension(654,700);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p=new Point(300,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		//driver.manage().window().maximize();
		String str=driver.getCurrentUrl();
		System.out.println(str);
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
		
				
		
	}
}
