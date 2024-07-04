package L19_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{
    @FindBy(xpath="//input[@name='user-name']")  private WebElement UN;
    @FindBy(xpath="//input[@name='password']")  private WebElement PW;
    @FindBy(xpath="//input[@name='login-button']")  private WebElement loginBtn;
	
    public SwagLabsLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void enterUN()
    {
    	UN.sendKeys("standard_user");
    }
    
    public void enterPW()
    {
    	PW.sendKeys("secret_sauce");
    }
    
    public void clickLoginBtn() 
    {
    	loginBtn.click();
    }
    
    
}
