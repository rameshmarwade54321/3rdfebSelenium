package L50_MockTask;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock15 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//clicked on sign in button
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		//clicked on Continue with Google
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String>ar=new ArrayList<String>(ids);
		
		//switch to child window
		driver.switchTo().window(ar.get(1));
		
		driver.manage().window().maximize();
		
		//enter email id 
	
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramesh.marwade99@gmail.com");
		Thread.sleep(2000);
		//driver.close();
		
		driver.switchTo().window(ar.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='apple-signin-button']")).click();
		
		Set<String> ids1 = driver.getWindowHandles();
		ArrayList<String>ar1=new ArrayList<String>(ids1);
 
		driver.switchTo().window(ar1.get(2));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='iforgot-link']")).click();
		
		Set<String> ids2 = driver.getWindowHandles();
		ArrayList<String>ar2=new ArrayList<String>(ids1);
 
		driver.switchTo().window(ar2.get(3));
		driver.manage().window().maximize();
		
		
		
		
	}
}
