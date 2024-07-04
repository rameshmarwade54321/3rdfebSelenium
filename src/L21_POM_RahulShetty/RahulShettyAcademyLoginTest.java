package L21_POM_RahulShetty;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyAcademyLoginTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		RahulShettyacademyLoginPage login=new RahulShettyacademyLoginPage(driver);
		login.enterUN();
		login.enterPWD1();
		Thread.sleep(2000);
		
		login.tickrRmbrUN();
		login.tickAgreeTerms();
		Thread.sleep(2000);
		
		login.ClickLoginBtn();
		
		RahulShettyAcademyHomePage verifySignIn=new RahulShettyAcademyHomePage(driver);
		System.out.println("-----Test Case 1(valid password )result-----");
		verifySignIn.verifyLogin();
		Thread.sleep(2000);
	
		verifySignIn.clickLogout();
		Thread.sleep(2000);
		System.out.println("----Test Case 2 (invalid password) result-------");
		
		login.enterUN();
		login.enterPWD2();
		Thread.sleep(2000);
		
		login.tickrRmbrUN();
		login.tickAgreeTerms();
		Thread.sleep(2000);
		login.ClickLoginBtn();
		
		LoginErrorPage error=new LoginErrorPage(driver);
		error.verifyLoginError();
		
		Thread.sleep(2000);
		System.out.println("----Test Case 3 (empty password) result-------");
		
		login.enterUN();
		login.enterPWD2();
		Thread.sleep(2000);
		
		login.tickrRmbrUN();
		login.tickAgreeTerms();
		Thread.sleep(2000);
		login.ClickLoginBtn();
		
		error.verifyLoginError();
		
		Thread.sleep(2000);
		
		System.out.println("----Test Case 4 (forget- reset password) result-------");
		login.clickOnFPWD();
		Thread.sleep(2000);
		ForgotPswdPage rlogin=new ForgotPswdPage(driver);
		rlogin.clickResetLogin();
		Thread.sleep(2000);
		
		ResetLoginPage pwd4=new ResetLoginPage(driver);
		String text = pwd4.getPWD();
		pwd4.clickOnGotoLogin();
		
		login.enterUN();
		login.enterPWD4(text);
		Thread.sleep(2000);
		
		login.tickrRmbrUN();
		login.tickAgreeTerms();
		Thread.sleep(2000);
		login.ClickLoginBtn();
		Thread.sleep(2000);
		verifySignIn.verifyLogin();
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
