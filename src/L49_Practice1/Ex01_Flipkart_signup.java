package L49_Practice1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex01_Flipkart_signup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		//add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//enter flipkart URL
		driver.get("https://www.flipkart.com/");
		
		
		
		// mouse over action on login then will get sign up option so store login path
		WebElement login = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		
		//create object for action class
		Actions act=new Actions(driver);
		
		//perform action on login tab
		act.moveToElement(login).perform();
		
		//click on signup
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		
		//write the mobile number in input field
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9209646387");
		
		//click on continue tab
		driver.findElement(By.xpath("//span[text()='CONTINUE']")).click();
		
		//click on request otp tab
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		Thread.sleep(10000);
		//enter otp manually
		
		//find path for search box
		WebElement e1 = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		
		//write text in search box
		e1.sendKeys("one plus mobiles 11R");
		
		//use keyboard keys to click enter
		e1.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		//select first visible option of mobile  and click
		driver.findElement(By.xpath("//div[@class='cPHDOP col-12-12']//div[text()='OnePlus Nord CE 3 Lite 5G (Pastel Lime, 128 GB)']")).click();
		
		//run get window handles to get child window id
		Set<String> tabids = driver.getWindowHandles();
		ArrayList<String> ar=new ArrayList<>(tabids);
		String ids = ar.get(1);
		
		//change focus from main window to child window
		driver.switchTo().window(ids);
		
		//click on add to cart tab
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		
	}
}
