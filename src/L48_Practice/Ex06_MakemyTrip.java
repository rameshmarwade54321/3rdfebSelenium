package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex06_MakemyTrip 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//input[@class='font14 fullWidth']")).sendKeys("9209646387");
		driver.findElement(By.xpath("//button[@data-cy='continueBtn']")).click();
		System.out.println("hi");
		
	}
}
