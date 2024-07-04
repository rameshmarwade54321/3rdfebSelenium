package L21_POM_RahulShetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahulShettyacademyLoginPage // extends ResetLoginPage
{

	@FindBy(xpath="//input[@id='inputUsername']") private WebElement UN;
	@FindBy(xpath="//input[@name='inputPassword']") private WebElement PWD1;
	@FindBy(xpath="//button[text()='Sign In']") private WebElement loginBtn;
	@FindBy(xpath="//input[@name='chkboxOne']") private WebElement rmbrUN;
	@FindBy(xpath="//input[@name='chkboxTwo']") private WebElement agreeTerms;
	@FindBy(xpath="//input[@name='inputPassword']") private WebElement PWD2;
	@FindBy(xpath="//input[@name='inputPassword']") private WebElement PWD3;
	@FindBy(xpath="//input[@name='inputPassword']") private WebElement PWD4;
	@FindBy(xpath="//a[text()='Forgot your password?']") private WebElement FPWD;
	
	public RahulShettyacademyLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUN() 
	{
		UN.sendKeys("rahul");
	}
	
	public void enterPWD1() 
	{
		PWD1.sendKeys("rahulshettyacademy");	
	}
	
	public void ClickLoginBtn() 
	{
		loginBtn.click();
	}
	
	public void tickrRmbrUN() 
	{
		rmbrUN.click();
	}
	
	public void tickAgreeTerms() 
	{
		agreeTerms.click();
	}
	
	public void enterPWD2() 
	{
		PWD2.sendKeys("rahulshettyacadem");	
	}
	
	public void enterPWD3() 
	{
		PWD3.sendKeys("");	
	}
	
	
	public void clickOnFPWD()
	{
		FPWD.click();
	}
	
	public void enterPWD4(String a) 
	{
		PWD4.sendKeys(a);	
	}
	
	
	



	
}
