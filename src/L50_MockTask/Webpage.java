package L50_MockTask;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage  implements CreateAccount
{
	
		WebDriver driver=new ChromeDriver();
		
		public static void main(String[] args) throws InterruptedException 
		{
			
			
			
			Webpage obj1=new Webpage();
			obj1.browser();
			Thread.sleep(5000);
			obj1.name();
			obj1.userid();
			
			
			
		}
		
	public void browser()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	
	public void name()
	{
	
		driver.findElement(By.xpath("//input[@style='width:185px;']")).sendKeys("abc");
		
	}
	
	public void userid()
	{
		driver.findElement(By.xpath("(//input[@style='width:185px;'])[2]")).sendKeys("123");
	}
	
	
	
}
