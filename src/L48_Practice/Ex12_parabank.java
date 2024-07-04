package L48_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex12_parabank
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com");
		
		//code for signup page
		
//		driver.findElement(By.xpath("//a[text()='Register']")).click();
//		driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("ramesh");
//		driver.findElement(By.xpath("//input[@name='customer.lastName']")).sendKeys("pawar");
//		driver.findElement(By.xpath("//input[@name='customer.address.street']")).sendKeys("pune");	
//		driver.findElement(By.xpath("//input[@name='customer.address.city']")).sendKeys("chinchwad");
//		driver.findElement(By.xpath("//input[@name='customer.address.state']")).sendKeys("maharashtra");
//		driver.findElement(By.xpath("//input[@name='customer.address.zipCode']")).sendKeys("411033");
//		driver.findElement(By.xpath("//input[@name='customer.phoneNumber']")).sendKeys("9518634210");
//		driver.findElement(By.xpath("//input[@name='customer.ssn']")).sendKeys("125463");
//		driver.findElement(By.xpath("//input[@name='customer.username']")).sendKeys("ramesh1234");
//		driver.findElement(By.xpath("//input[@name='customer.password']")).sendKeys("ramesh@1234");
//		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("ramesh@1234");
//		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ramesh123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ramesh@123");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		
		driver.findElement(By.xpath("//a[text()='Open New Account']")).click();
		
		driver.findElement(By.xpath("//select[@ng-model='types.selectedOption']")).click();
	
		
	}
}
