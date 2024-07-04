package L14_WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex03_getdataFromTable
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable");
		
	
		 WebElement e1 = driver.findElement(By.xpath("//table[@id='countries']//tr[2]//td[2]"));
		 String text = e1.getText();
		 System.out.println(text);
		 
		 
		 
		 
		
	}
}
