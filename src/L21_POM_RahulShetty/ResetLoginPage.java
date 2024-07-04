package L21_POM_RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetLoginPage 
{

	 @FindBy(xpath="//p[@class='infoMsg']") private WebElement tempPWD;
	 @FindBy(xpath="//button[text()='Go to Login']") private WebElement gotoLogin;

	 public ResetLoginPage (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	

	 public String getPWD()
	 {
		 String tempPassword = tempPWD.getText();
		// Please use temporary password 'rahulshettyacademy' to Login.
		 String tempPass=tempPassword.split("'")[1];
		 //String tempPass=str1[1];
		return tempPass;		 
		 
		 
	 }
	 
	 public void clickOnGotoLogin()
	 {
		 gotoLogin.click();
	 }
	 
	 
	 
	 
}
