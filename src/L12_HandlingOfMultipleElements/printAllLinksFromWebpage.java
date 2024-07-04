package L12_HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllLinksFromWebpage 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement link:alllinks)
		{
			System.out.println(link.getText());
		}
		
		int linkssize = alllinks.size();
		System.out.println(linkssize);
		
		System.out.println(alllinks.size());
		
		System.out.println(driver.findElements(By.xpath("//a")).size());
	}
}
