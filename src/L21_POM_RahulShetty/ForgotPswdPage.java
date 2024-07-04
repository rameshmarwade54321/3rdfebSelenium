package L21_POM_RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPswdPage 
{

	@FindBy(xpath="//button[text()='Reset Login']") private WebElement resetLogin;
	
	public ForgotPswdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickResetLogin()
	{
		resetLogin.click();
	}
}
