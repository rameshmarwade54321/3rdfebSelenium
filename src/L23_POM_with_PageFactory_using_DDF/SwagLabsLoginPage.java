package L23_POM_with_PageFactory_using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{

	@FindBy(xpath="//input[@name='user-name']") private WebElement UN;
	@FindBy(xpath="//input[@name='password']") private WebElement PWD;
	@FindBy(xpath="//input[@name='login-button']") private WebElement loginBtn;
	@FindBy(xpath="//button[@class='error-button']") private WebElement errMsg;
	
	
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpSwagLabsLoginPageUsername(String Username)
	{
		UN.sendKeys(Username);
	}
	
	public void inpSwagLabsLoginPagePassword(String Password)
	{
		PWD.sendKeys(Password);
	}
	
	public void clickSwagLabsLoginPageLoginButton()
	{
		loginBtn.click();
	}
	
	public void verifySwagLabsLoginPageErrorMsg()
	{
		if(errMsg.isDisplayed())
		{
			System.out.println("Ts pass");
		}
		else
		{
			System.out.println("TS fail");
		}
	}
	
	
}
