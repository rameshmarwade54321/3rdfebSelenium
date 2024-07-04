package L17_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex02_WithDDF 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//enter username
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
			Thread.sleep(2000);
		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		//click login
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(2000);
		//get header text to validate test case
		String acttext = driver.findElement(By.xpath("//span[text()='Products']")).getText();
		String exptext = sh.getRow(0).getCell(2).getStringCellValue();
		
		if(acttext.equals(exptext))
		{
			System.out.println("TS pass");
		}
		else
		{
			System.out.println("TS fail");
		}
		
		//click on open menu
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(2000);
		//click on log out
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		
		
		
	}
}
