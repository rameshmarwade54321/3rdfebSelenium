package L12_HandlingOfMultipleElements;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleChechbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/rames/Desktop/new4.html");
		
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
//		for(WebElement check:checkbox)
//		{
//			check.click();
//			Thread.sleep(500);
//		}
		
		Thread.sleep(2000);
	       ListIterator<WebElement> tick = checkbox.listIterator();
		
	       //forward direction
	       while(tick.hasNext())
	       {
	    	   tick.next().click();
	    	   Thread.sleep(500);
	    	   
	       }
	       
	       Thread.sleep(2000);
	       
	       //reverse direction
	       while(tick.hasPrevious())
	       {
	    	   tick.previous().click();
	    	   Thread.sleep(500);
	    	   
	       }
		
	}
}
