package L22_Amazon_AddToCartVerify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{

	@FindBy(xpath="//span[@class='a-truncate-cut']") private WebElement productText;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyProduct()
	{
		String acttext = productText.getText();
		String exptext = "Samsung Galaxy M34 5G (Waterfall Blue,6GB,128GB)";
		if(acttext.contains(exptext))
		{
			System.out.println("TS PAss");
		}
		else
		{
			System.out.println("TS Fail");
		}
	}
	
}
