package L25_POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsTest 
{

	WebDriver driver;
	SwagLabsLoginPage loginPage;
	SwagLabsHomePage homePage;
	SwagLabsOpenMenuPage openMenuPage;
	Sheet  sh;
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file=new  FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Thread.sleep(4);
		loginPage=new SwagLabsLoginPage(driver);
		homePage=new SwagLabsHomePage(driver);
		openMenuPage=new  SwagLabsOpenMenuPage(driver);
		
	}

	@BeforeMethod
	public void loginToApp() throws InterruptedException
	{
		
		
		loginPage.inpSwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		loginPage.inpSwagLabsLoginPagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		loginPage.clickSwagLabsLoginPageLoginButton();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyLogin() throws InterruptedException
	{
		String acttext=homePage.getproductsText();
		String exptext=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(acttext, exptext);
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logoutFromApp() throws InterruptedException
	{
		homePage.clickSwagLabsOpenMenuPageOpenMenuBtn();
		Thread.sleep(2000);
		openMenuPage.clickSwagLabsOpenMenuPageLogoutBtn();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
