package L22_Amazon_AddToCartVerify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage 
{
	
	@FindBy(xpath="//div[@data-asin='B0C7C28GKF']//button") private WebElement addToCart;
	@FindBy(xpath="//a[@id='nav-cart']") private WebElement cartIcone;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCart()
	{
		addToCart.click();
	}
	
	public void clickOnCartIcone()
	{
		cartIcone.click();
	}
	
}
