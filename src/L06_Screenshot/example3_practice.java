package L06_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example3_practice 
{

	public static void main(String[] args) throws IOException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://meet.google.com/?hs=197&authuser=0");
		
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	File dest=new File("E:\\Software testing\\automation Sanjay Sir\\screenshot\\gmeet1.png");
	
	FileHandler.copy(source, dest);
	

	
	}
}
