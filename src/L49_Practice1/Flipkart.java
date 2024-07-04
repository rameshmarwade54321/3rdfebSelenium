package L49_Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		Thread.sleep(5000);
	    List<WebElement> allops = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		System.out.println(allops.size());
	    String expops="15";
	
	    for(WebElement s1:allops)
	    {
	    	
	    	String actops = s1.getText();
	    	System.out.println(actops);
	    	Thread.sleep(2000);
	    	if(actops.contains(expops))
	    	{
	    	s1.click();
	    	break;
	    	}
	    }
	    
	}
}
