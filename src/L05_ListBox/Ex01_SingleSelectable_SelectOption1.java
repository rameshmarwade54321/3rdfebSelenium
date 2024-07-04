package L05_ListBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex01_SingleSelectable_SelectOption1
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
	//	driver.manage().window().maximize();
		Thread.sleep(1000);
		//step1: find path for listbox and store it in object
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		

		
		//create an object of select class
		Select s=new Select(month);
		
		//use select class method for selecting option in list box
		s.selectByVisibleText("Feb");
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("3");
		Thread.sleep(2000);
		
		//driver.close();
		try
		{
		s.deselectByIndex(1);
		}
		catch(Exception e)
		{
			System.out.println("exception handled");
		}
		System.out.println("hi");
		
	}
}
