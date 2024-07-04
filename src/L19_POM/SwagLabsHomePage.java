package L19_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{

	@FindBy(xpath="//span[text()='Products']")private WebElement productsText;
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement openMenuBtn;
	
	public SwagLabsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyProductsText()
	{
		String actText = productsText.getText();
		String expText = "Products";
		
		if(actText.equals(expText))
		{
			System.out.println("TS pass");
		}
		else
		{
			System.out.println("TS fail");
		}
	}
	
	public void clickOpenMenuBtn() 
	{
		openMenuBtn.click();
	}
	
	
	
}
