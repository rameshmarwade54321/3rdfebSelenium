package L06_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example4 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement s1 = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		File source1 = s1.getScreenshotAs(OutputType.FILE);
		System.out.println(source1);
		File dest1=new File("E:\\Software testing\\automation Sanjay Sir\\screenshot\\doodle.png");
		FileHandler.copy(source1, dest1);
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://meet.google.com/");
		Thread.sleep(4000);
    	WebElement logo = driver.findElement(By.xpath("//img[@alt='Google Meet Product Logo']")); 
    
    	File src = logo.getScreenshotAs(OutputType.FILE);
    	System.out.println(src);
    	File dest = new File("E:\\Software testing\\automation Sanjay Sir\\screenshot\\MeetLogo1.png");
    	FileHandler.copy(src,dest);

	
    	driver.switchTo().newWindow(WindowType.TAB);
    	driver.get("https://www.instagram.com/");
    	WebElement logo1 = driver.findElement(By.xpath("//i[@data-visualcompletion='css-img']"));
    	File scr2 = logo1.getScreenshotAs(OutputType.FILE);
	    System.out.println(scr2);
	
	    File dest2 = new File("E:\\Software testing\\automation Sanjay Sir\\screenshot\\instaLogo1.png");
    	FileHandler.copy(scr2,dest2);
	    
	}
}
