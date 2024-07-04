package L14_WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_getRowsCount 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		System.out.println(rows.size());
		
	}
}
