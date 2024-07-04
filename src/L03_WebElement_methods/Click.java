package L03_WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.jvm.hotspot.ui.treetable.TreeTableModelAdapter;

public class Click 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		//click on creat new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		//click on select male option
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
	}
}
