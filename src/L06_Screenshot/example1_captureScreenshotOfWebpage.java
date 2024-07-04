package L06_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example1_captureScreenshotOfWebpage 
{

	public static void main(String[] args) throws IOException
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		System.out.println(source);
		
		File dest=new File("E:\\Software testing\\automation Sanjay Sir\\screenshot\\webpage.png");
	
	    FileHandler.copy(source, dest);
	   
	   
	    main(10);
	    
	}
	
	public static void main(int a)
	{
		System.out.println(a+a);
	}
	
	
}
