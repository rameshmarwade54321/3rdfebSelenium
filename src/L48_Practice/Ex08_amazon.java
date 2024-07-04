package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex08_amazon 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("920646387");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("password1");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.close();
	}
}
