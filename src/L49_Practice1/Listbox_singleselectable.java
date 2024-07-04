package L49_Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_singleselectable
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new  Select(e1);
		
		s.selectByVisibleText("Jan");
//		s.selectByIndex(7);
//		s.selectByValue("2");
		
		System.out.println(s.isMultiple());
		
		//s.deselectByVisibleText("Jan");
		
		boolean s1 = s.isMultiple();
		
		if(s1)
		{
			System.out.println("listbox is multiselectable");
		}
		else
		{
			System.out.println("list box is single selecatable");
		}
	}
}
