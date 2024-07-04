package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex22_listbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(4000);
		//1=find path for list and store into element
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//2=create object for select class and pass element in select class constructor
		Select s=new Select(month);
		//use select class method
		Thread.sleep(2000);
		s.selectByVisibleText("Mar");
		Thread.sleep(2000);
		s.selectByValue("6");
		Thread.sleep(2000);
		s.selectByIndex(11);
	}
}
