package L49_Practice1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_multipleelement 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		Thread.sleep(5000);
		
		List<WebElement> e1 = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
	   // System.out.println(e1.size());
		String exp="iphone 14";
		for(WebElement s1:e1)
	    {
	    	
	    	String actops = s1.getText();
	    	System.out.println(actops);
	    	if(actops.equals(exp))
	    	{
	    	s1.click();
	    	break;
	    	}
	    }
	
	  
	}
}