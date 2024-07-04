package L26_POM_DDF_TestNG_BaseClass_UtilityClass;

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

public class SwagLabsTest extends BaseClass
{

	
	SwagLabsLoginPage loginPage;
	SwagLabsHomePage homePage;
	SwagLabsOpenMenuPage openMenuPage;
	
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
	
		initializeBrowser();
		Thread.sleep(4);
		loginPage=new SwagLabsLoginPage(driver);
		homePage=new SwagLabsHomePage(driver);
		openMenuPage=new  SwagLabsOpenMenuPage(driver);
		
	}

	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		
		loginPage.inpSwagLabsLoginPageUsername(UtilityClass.getTD(0, 0));
		Thread.sleep(2000);
		loginPage.inpSwagLabsLoginPagePassword(UtilityClass.getTD(0, 1));
		Thread.sleep(2000);
		loginPage.clickSwagLabsLoginPageLoginButton();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyLogin() throws InterruptedException, EncryptedDocumentException, IOException
	{
		String acttext=homePage.getproductsText();
		String exptext=UtilityClass.getTD(0, 2);
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
