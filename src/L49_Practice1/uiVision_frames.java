package L49_Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uiVision_frames 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("abc");
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_2.html']")));
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("abc");
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_4.html']")));
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("abc");
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("abc");
	
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width='650']")));
		driver.findElement(By.xpath("//div[@id='i5']")).click();
		
		Actions act=new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath("//div[@id='i19']")));
		
		driver.findElement(By.xpath("//div[@id='i19']")).click();
	
	}
}
