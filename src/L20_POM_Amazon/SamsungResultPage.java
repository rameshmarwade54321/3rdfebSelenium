package L20_POM_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SamsungResultPage 
{

	@FindBy(xpath="(//div[@data-index='3']//a)[2]") private WebElement results;
	@FindBy(xpath="(//button[text()='Add to cart'])[2]") private WebElement addToCart;
	@FindBy(xpath="//a[@id='nav-cart']") private WebElement cartIcon;
	public SamsungResultPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyResults() 
	{
		String actresult = results.getText();
		String expresult = "Samsung Galaxy";
		
		if (actresult.contains(expresult)) 
		{
			System.out.println("TS Pass");
		} 
		else
		{
			System.out.println("TS Fail");
		}
	}
	
	public void clickOnAddToCart()
	{
		addToCart.click();
	}
	
	public void clickCartIcone()
	{
		cartIcon.click();;
	}
	
	
	
}
