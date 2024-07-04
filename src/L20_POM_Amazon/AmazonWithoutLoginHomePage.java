package L20_POM_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonWithoutLoginHomePage 
{

	@FindBy(xpath="//input[@id='twotabsearchtextbox']") private WebElement searchBox;
	@FindBy(xpath="//a[@id='nav-logo-sprites']") private WebElement logo;
	@FindBy(xpath="//a[@id='nav-cart']") private WebElement cartIcon;
	
	public AmazonWithoutLoginHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterTextInSearchBox()
	{
		searchBox.sendKeys("samsung galaxy");
		searchBox.submit();
	}
	
	public void verifyLogo()
	{
		boolean logodisplay = logo.isDisplayed();
		if(logodisplay)
		{
			System.out.println("TS pass");		
		}
		else
		{
			System.out.println("TS fail");
		}
	}
	
	public void verifyCartIcone()
	{
		boolean carticon = cartIcon.isDisplayed();
		if(carticon)
		{
			System.out.println("TS pass");
		}
		else
		{
			System.out.println("TS fail");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
