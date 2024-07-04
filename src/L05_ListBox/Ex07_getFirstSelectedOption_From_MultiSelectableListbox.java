package L05_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex07_getFirstSelectedOption_From_MultiSelectableListbox 
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
		
		WebElement FirstSelectedOption = s.getFirstSelectedOption();
		
		String text = FirstSelectedOption.getText();
		
		System.out.println(text);
		
		System.out.println(s.getFirstSelectedOption().getText());
}
}
