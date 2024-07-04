package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex10_rent_sell_property 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://103.240.34.122:8085/");
		
		driver.findElement(By.xpath("//i[@class='feather-user-plus']")).click();
	}
}
