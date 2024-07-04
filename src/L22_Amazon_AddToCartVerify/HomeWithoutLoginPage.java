package L22_Amazon_AddToCartVerify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeWithoutLoginPage 
{

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")  private WebElement searchBox;


	public HomeWithoutLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterText() 
	{
		searchBox.sendKeys("samsung galaxy");
		searchBox.submit();
	}
	
	



}
