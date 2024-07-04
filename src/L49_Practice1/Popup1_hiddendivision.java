package L49_Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1_hiddendivision 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("Create new")).click();
		
		Thread.sleep(3000);
		
		//System.out.println(driver.findElements(By.xpath("//a")).size());
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcderfg");
	}
}
