package L11_Autosuggestions;

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
		
	    String expops="iphone 14";
	
	    for(WebElement s1:allops)
	    {
	    	
	    	String actops = s1.getText();
	    	System.out.println(actops);
	    	if(actops.equals(expops))
	    	{
	    	s1.click();
	    	break;
	    	}
	    }
	    
	}
}
