package L10_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_Mainpage_to_Iframe 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to iframe
		driver.switchTo().frame("iframeResult");

		//click on element present in iframe
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
	
	
		//switch from iframe to main page
		driver.switchTo().parentFrame();
	//	driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}
}
