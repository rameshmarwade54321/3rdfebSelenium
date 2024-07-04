package L22_Amazon_AddToCartVerify;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddToCartTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		HomeWithoutLoginPage home=new HomeWithoutLoginPage(driver);
		home.enterText();
		Thread.sleep(3000);
		
		ProductPage products=new ProductPage(driver);
		products.clickOnAddToCart();
		Thread.sleep(2000);
		products.clickOnCartIcone();
		Thread.sleep(2000);
		
		CartPage cart=new CartPage(driver);
		cart.verifyProduct();
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
