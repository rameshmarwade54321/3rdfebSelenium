package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex05_Redbus 
{
	
	public static void main(String [] args) throws InterruptedException
	{
		//System.setProperty("WebDriver.Chrome.Driver", "C:\\Salenium Software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//i[@class='icon icon-user_profile_new icon_rb_secondary_item']")).click();
	
	driver.findElement(By.xpath("//li[@id='user_sign_in_sign_up']")).click();
	driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='mobileNoInp']")).sendKeys("9209646387");
	
	
	}
}
