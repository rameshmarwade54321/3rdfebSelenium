package L49_Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Iframe 
{

	public static void main(String[] args) throws InterruptedException 
	{
//		ChromeOptions ops=new ChromeOptions();
//		ops.addArguments("--disable-cookies");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://mailchimp.com/");
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(4000);
		driver.switchTo().frame("iframeResult");
	    driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
	    
	    driver.switchTo().parentFrame();
	    //driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	}
}
