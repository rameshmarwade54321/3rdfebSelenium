package L14_WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex04_GetAllDataFromTable 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable");
		
	
		  List<WebElement> e1 = driver.findElements(By.xpath("//table[@id='countries']//tr[2]//td"));
		 
		 
		 
		 
		 
		
	}
}
