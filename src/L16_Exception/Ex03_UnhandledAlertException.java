package L16_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex03_UnhandledAlertException
{

	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	//enter customer ID on main page
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("100");
	//click on submit btn main page
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	}
	
}
