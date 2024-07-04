package L21_POM_RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahulShettyAcademyHomePage 
{

	@FindBy(xpath="//p[text()='You are successfully logged in.']") private WebElement loginText;
	@FindBy(xpath="//button[@class='logout-btn']") private WebElement logoutBtn;
	public RahulShettyAcademyHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void verifyLogin()
	{
		String actText = loginText.getText();
		String expText = "You are successfully logged in.";
		if(actText.equals(expText))
		{
			System.out.println("TS Pass");
		}
		else
		{
			System.out.println("TS fail");
		}
	}
	
	public void clickLogout()
	{
		logoutBtn.click();
	}

}
