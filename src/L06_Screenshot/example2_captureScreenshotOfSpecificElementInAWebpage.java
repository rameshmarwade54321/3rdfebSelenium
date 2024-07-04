package L06_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example2_captureScreenshotOfSpecificElementInAWebpage 
{

	public static void main(String[] args) throws IOException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		File source = logo.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest=new File("E:\\Software testing\\automation Sanjay Sir\\screenshot\\logo.png");
		
		FileHandler.copy(source, dest);
		
		
	}
}
