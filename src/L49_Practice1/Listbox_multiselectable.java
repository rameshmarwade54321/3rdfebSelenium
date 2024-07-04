package L49_Practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_multiselectable
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Software%20testing/automation%20Sanjay%20Sir/new%202.html");
		
		
		
		
		
		WebElement e1 = driver.findElement(By.xpath("//select[@multiple='true']"));
		
		Select s=new  Select(e1);
		
		s.selectByVisibleText("india");
		Thread.sleep(2000);
		s.selectByVisibleText("aus");
		Thread.sleep(2000);
		s.selectByVisibleText("china");
		Thread.sleep(2000);
		
		System.out.println(s.isMultiple());
		
		//s.deselectByVisibleText("aus");
		//s.deselectAll();
		
	//	WebElement s1 = s.getFirstSelectedOption();
		
		List<WebElement> s1 = s.getOptions();
		
		for(WebElement a1:s1)
		{
				System.out.println(a1.getText());
		}
		
		
		
//		String s2 = s1.getText();
//		String s3="india";
//		
//		if (s2.equals(s3)) 
//		{
//			System.out.println("correct option selected");
//		}
//		
//		else
//		{
//			System.out.println("wrong option selected");
//		}
		
		
	}
}
