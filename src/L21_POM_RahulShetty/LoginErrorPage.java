package L21_POM_RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginErrorPage 
{

	@FindBy(xpath="//p[@class='error']") private WebElement loginError;
	
	public LoginErrorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLoginError()
	{
		String actErrorText = loginError.getText();
		String ExpErrorText = "* Incorrect username or password";
		
		if(actErrorText.equals(ExpErrorText))
		{
			System.out.println("TS Pass");
		}
		else
		{
			System.out.println("TS Fail");
		}
	}
}
