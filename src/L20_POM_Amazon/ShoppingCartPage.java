package L20_POM_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage 
{

	@FindBy(xpath="//span[@class='a-truncate-cut']") private WebElement cartItem1;

	public ShoppingCartPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void verifyCartItem()
	{
		String acttext = cartItem1.getText();
		System.out.println(acttext);
		String exptext = "Waterfall Blue,6GB,128GB";
		
		if(acttext.contains(exptext))
		{
			System.out.println("TS Pass");
		}
		else
		{
			System.out.println("TS fail");
		}
	}


}
