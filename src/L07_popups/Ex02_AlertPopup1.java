package L07_popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex02_AlertPopup1
{
public static void main(String[] args) throws InterruptedException
{
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/delete_customer.php");
//enter customer ID on main page
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("100");
//click on submit btn main page
driver.findElement(By.xpath("//input[@name='submit']")).click();
//1: get text from alert popup
String text = driver.switchTo().alert().getText();
System.out.println(text);
//2: click on Cancel btn from alert popup
//driver.switchTo().alert().dismiss();
//3: click on OK btn from 1st alert popup
driver.switchTo().alert().accept();
//3: click on OK btn from 2nd alert popup
driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();    it will hit no alert present exception
}
}