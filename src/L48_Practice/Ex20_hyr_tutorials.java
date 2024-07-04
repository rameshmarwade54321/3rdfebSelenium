package L48_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex20_hyr_tutorials 
{

	public static void main(String[] args) throws Exception 
	{
	
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		Thread.sleep(10000);
		
		//driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("ramesh@gmail.com");
		
		driver.findElement(By.xpath("//div[@class='container']/child::label[3]/following-sibling::input[1]")).sendKeys("ramesh@gmail.com");
		
		driver.findElement(By.xpath("//div[@class='container']/descendant::label[text()='First Name ']/following-sibling::input[1]")).sendKeys("ramesh");
		
		driver.findElement(By.xpath("//div[@class='container']/child::label[text()='Last Name']/following-sibling::input[1]")).sendKeys("marwade");
	
	
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='container']/descendant::div[@class='buttons']/child::button[text()='Clear']")).click();
	
	}
}
