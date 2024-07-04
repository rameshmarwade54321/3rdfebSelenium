package L20_POM_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSeachBoxResultTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		AmazonWithoutLoginHomePage search=new AmazonWithoutLoginHomePage(driver);
		System.out.println("-----verify logo test case --------");
		search.verifyLogo();
		
		search.enterTextInSearchBox();
		
		SamsungResultPage result=new SamsungResultPage(driver);
		System.out.println("-----verify samsung mobile result  test case --------");
		result.verifyResults();
		
		Thread.sleep(3000);
		System.out.println("-----verify cart icon test case --------");
		search.verifyCartIcone();
		
		
		Thread.sleep(3000);
		result.clickOnAddToCart();
		Thread.sleep(4000);https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=4123770
		
		result.clickCartIcone();
		System.out.println("-----verify samsung cart item  test case --------");
		ShoppingCartPage cartItem = new ShoppingCartPage(driver);
		cartItem.verifyCartItem();
		
		
		Thread.sleep(4000);
		driver.quit();
	}
}
