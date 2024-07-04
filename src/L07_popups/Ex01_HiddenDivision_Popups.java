package L07_popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex01_HiddenDivision_Popups 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='flex items-center tp:hidden']/descendant::div[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='signUp-phoneNumber']")).sendKeys("9999999999");
		
		
	}
	
}