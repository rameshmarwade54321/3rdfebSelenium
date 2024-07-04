package L03_WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		
		Thread.sleep(2000);
		
		WebElement loanamt = driver.findElement(By.xpath("//input[@name='loanamount']"));
		loanamt.clear();
		
		loanamt.sendKeys("150000000");
		Thread.sleep(2000);
		String value = loanamt.getAttribute("value");
		System.out.println(value);
				
	}
	
}
