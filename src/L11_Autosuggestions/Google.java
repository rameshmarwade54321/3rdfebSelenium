package L11_Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(3000);
		List<WebElement> allops = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']"));
		
		String expopt="13c 5g";
		
		for(WebElement s1:allops)
		{
			String actopt = s1.getText();
			if(actopt.contains(expopt))
			{
				s1.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		
		String s2 = e1.getText();
		
		if(s2.equals(expopt))
		{
			System.out.println("selected correct option");
		}
		else
		{
			System.out.println("wrong option selected");
		}
		
		
		
	}
}
