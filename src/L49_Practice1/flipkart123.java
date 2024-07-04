package L49_Practice1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart123 
{

	public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
		
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
			
			Thread.sleep(2000);
			List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']"));
			List<WebElement> links = driver.findElements(By.xpath("//a"));
			
			 for(WebElement all:links)
			 {
				 String alltext =all.getText();
				 
				 for(WebElement option:alloptions)
					{
						String actoption = option.getText();
						
						if(alltext.equals(actoption))
						{
							
							option.click();
							break;
							
						}
					}
			 }
			 driver.close();
				 	 
		}
}

		