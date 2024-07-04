package L19_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsOpenMenuPage 
{

	@FindBy(xpath="//a[text()='Logout']")WebElement logoutBtn;
	
	public SwagLabsOpenMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogotBtn()
	{
		logoutBtn.click();
	}
	
}
