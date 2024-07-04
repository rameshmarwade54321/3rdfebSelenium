package L08_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex05_mouseDragAndDropAction 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//li[@id='credit']//following-sibling::li[@id='fourth'][1]"));
		WebElement dest = driver.findElement(By.xpath("//ol[@id='amt7']/child::li[@class='placeholder']"));
		
		Actions act=new  Actions(driver);
	//	act.dragAndDrop(src, dest).perform();
		
	//	act.moveToElement(src).clickAndHold().moveToElement(dest).release().perform();
		
		act.clickAndHold(src).release(dest).perform();
		
	}
}
