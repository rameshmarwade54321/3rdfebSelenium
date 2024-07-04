package L27_POM_DDF_TestNG_UtilityClass_BaseClass_FailedTCesSS_PropertyFile;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsTest extends BaseClass
{

	int TCID;
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
		
		
		loginPage.inpSwagLabsLoginPageUsername(UtilityClass.getPFdata("UN"));
		Thread.sleep(2000);
		loginPage.inpSwagLabsLoginPagePassword(UtilityClass.getPFdata("PWD"));
		Thread.sleep(2000);
		loginPage.clickSwagLabsLoginPageLoginButton();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyLogin() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=101;
		String acttext=homePage.getproductsText();
		String exptext=UtilityClass.getTD(0, 1);
		Assert.assertEquals(acttext, exptext);
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logoutFromApp(ITestResult s1) throws InterruptedException, IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.getFailedTCesSS(driver, TCID);
		}
		
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
