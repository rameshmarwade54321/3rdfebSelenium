package L05_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex06_getSelectedOption_From_SingleSelectableListbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		
		WebElement FirstSelectedOption = s.getFirstSelectedOption();
		
		String text = FirstSelectedOption.getText();
		System.out.println(text);
		
		System.out.println(s.getFirstSelectedOption().getText());
	

		WebElement month1 = driver.findElement(By.id("month"));
		Select s1=new Select(month1);
		s1.selectByVisibleText("Jan");
		
		Thread.sleep(2000);
		
		WebElement FirstSelectedOption1 = s1.getFirstSelectedOption();
		
		String text1 = FirstSelectedOption1.getText();
		
		System.out.println(text1);
		
		
		
	}
}
