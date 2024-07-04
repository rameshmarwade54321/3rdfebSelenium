package L49_Practice1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Set<String> s1 = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<String>(s1);   //mainwindowid=0   childwindowid=1
		String childWindowID = ar.get(1);
		
		driver.switchTo().window(childWindowID);
		driver.findElement(By.xpath("//header[@class='header-bar']//span[text()='Training']")).click();
	  
	    
		driver.switchTo().window(ar.get(0));
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	}
}
