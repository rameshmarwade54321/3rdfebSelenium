package L49_Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConfirmationPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(3000);
		
		String s1 = driver.switchTo().alert().getText();
		System.out.println(s1);
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		driver.switchTo().alert().dismiss();
		
	}
}
