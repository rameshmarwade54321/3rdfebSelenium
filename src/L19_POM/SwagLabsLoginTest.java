package L19_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		SwagLabsLoginPage login=new SwagLabsLoginPage(driver);
			login.enterUN();
			login.enterPW();
			login.clickLoginBtn();
			Thread.sleep(2000);
			
		SwagLabsHomePage home=new SwagLabsHomePage(driver);
			home.verifyProductsText();
			home.clickOpenMenuBtn();
			Thread.sleep(2000);
			
		SwagLabsOpenMenuPage	openMenu=new SwagLabsOpenMenuPage(driver);
			openMenu.clickLogotBtn();
			Thread.sleep(2000);
			
			driver.quit();
	}
}
