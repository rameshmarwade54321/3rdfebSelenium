package L07_popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex04_ChildWindow 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allids);
		String childWindowId = al.get(1);
		
		driver.switchTo().window(childWindowId);
		
		//driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		driver.findElement(By.xpath("//header[@class='header-bar']//span[text()='Training']")).click();
		
		
		
		
	}
}
