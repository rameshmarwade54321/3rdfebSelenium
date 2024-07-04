package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex15_nicelocal 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://nicelocal.in/pune/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='header-switcher-icon'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Country hotels']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@class='title-link js-item-url ']")).click();
		
		Thread.sleep(000);
		driver.get("https://nicelocal.in/pune/holiday_house/elite_choice_unisx_pg/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@data-title='Reviews']")).click();

		
		
		
		
	}
}
