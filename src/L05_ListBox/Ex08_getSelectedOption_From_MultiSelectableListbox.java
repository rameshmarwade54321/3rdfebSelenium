package L05_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex08_getSelectedOption_From_MultiSelectableListbox 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Software%20testing/automation%20Sanjay%20Sir/new%202.html");
		Thread.sleep(2000);
		
		
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		//step1: find path for listbox and store it in object
		WebElement country = driver.findElement(By.xpath("//select[@multiple='true']"));
	
		Select s=new Select(country);
		s.selectByVisibleText("india");
		s.selectByVisibleText("eng");
		s.selectByVisibleText("aus");
		
		List<WebElement> AllSelectedOptions = s.getAllSelectedOptions();
		int size = AllSelectedOptions.size();
		System.out.println(size);
		
		System.out.println(s.getAllSelectedOptions().size());
		
		
		for(WebElement s1:AllSelectedOptions)
		{
			System.out.println(s1.getText());
		}
}
}
