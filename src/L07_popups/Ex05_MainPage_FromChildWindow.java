package L07_popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex05_MainPage_FromChildWindow 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		
		//added implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//enter the URL
		driver.get("https://skpatro.github.io/demo/links/");
		//click on NewTab button
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//find out index ID for main window and child window
		Set<String> al = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<String>(al);
		String childWindowID = ar.get(1);
		
		//switch focus on child window
		driver.switchTo().window(childWindowID);
		Thread.sleep(2000);
		//click on training option
		driver.findElement(By.xpath("//header[@class='header-bar']//span[text()='Training']")).click();
		Thread.sleep(2000);
		//change focus from child window to main window
	
		
		driver.switchTo().window(ar.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(2000);
		//change focus from main page to 2nd child window
		Set<String> m2 = driver.getWindowHandles();
		ArrayList<String>ar2=new ArrayList<String>(m2); //main page 0, child window1=1, childwindow2=2
		
		driver.switchTo().window(ar2.get(2));
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//header//span[text()='Training']")).click();
		
		
		
		
		
		
		
	}
}
