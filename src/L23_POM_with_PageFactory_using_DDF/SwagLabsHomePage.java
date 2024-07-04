package L23_POM_with_PageFactory_using_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{

	@FindBy(xpath="//span[text()='Products']") private WebElement productText;
	
	
	public SwagLabsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifySwagLabsHomePageProductText(String exptext)
	{
		String acttext = productText.getText();
		if(acttext.equals(exptext))
		{
			System.out.println("TS Pass");
		}
		else
		{
			System.out.println("TS Fail");
		}
	}
}
