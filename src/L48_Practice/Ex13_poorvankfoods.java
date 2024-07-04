package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex13_poorvankfoods 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://poorvankfoods.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		
		driver.findElement(By.xpath("//span[text()='Products']")).click();
		
		driver.findElement(By.xpath("//span[text()='Mango Pickle']")).click();
	
		
		driver.findElement(By.xpath("//a[text()='Select options']")).click();
		
		driver.findElement(By.xpath("//table[@class='variations']"));
				
		driver.findElement(By.xpath("//select[@id='weight']")).click();
		
		//driver.findElements(By.xpath("//option[text()='500 g']"));
		
		
		
	}
}
