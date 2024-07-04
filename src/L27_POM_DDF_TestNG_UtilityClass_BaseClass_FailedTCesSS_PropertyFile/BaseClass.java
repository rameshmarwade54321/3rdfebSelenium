package L27_POM_DDF_TestNG_UtilityClass_BaseClass_FailedTCesSS_PropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	WebDriver driver;

	public void initializeBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(UtilityClass.getPFdata("URL"));
		
	}
}
