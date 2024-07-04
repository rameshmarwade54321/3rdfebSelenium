package L03_WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GetText 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
	String text=	driver.findElement(By.xpath("(//a[@role='button'])[2]")).getText();
	System.out.println(text);
	}
}
