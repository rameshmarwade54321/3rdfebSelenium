package L05_ListBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex05_isMultiple
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Software%20testing/automation%20Sanjay%20Sir/new%202.html");
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//step1: find path for list box and store it in object
		WebElement country = driver.findElement(By.xpath("//select[@multiple='true']"));
		

		
		//create an object of select class
		Select s=new Select(country);
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("listbox is multiselectable");
		}
		else
		{
			System.out.println("listbox is not multiselectable");
		}
		
	}
}
