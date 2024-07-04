package L23_POM_with_PageFactory_using_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
	
		FileInputStream file=new  FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		SwagLabsLoginPage login=new SwagLabsLoginPage(driver);
		login.inpSwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		login.inpSwagLabsLoginPagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(2000);
		login.clickSwagLabsLoginPageLoginButton();
		Thread.sleep(2000);
		
		SwagLabsHomePage home=new SwagLabsHomePage(driver);
		home.verifySwagLabsHomePageProductText(sh.getRow(0).getCell(2).getStringCellValue());
		
		driver.quit();
	}
}
