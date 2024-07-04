package L47_XpathAdvance;
///*[5/14/2024 10:50 PM] Abhijeet Chillal: Advance Xpath / XPath Axes
//
//As we know that path defines the location of a node using absolute or relative path.
// In the same manner XPath axes are used to identify elements by their relationship like parent, 
// child, sibling, etc. Axes refer to axis on which elements are lying relative to an element.
//
//1)	ancestor	-->It specifies the ancestors of the current nodes which include the parents up to 
//the root node.
//2)	child -->It specifies the children of the current node.
//3)	descendant -->	It specifies the descendants of the current node i.e. the node's children up to the leaf node(no more children).
//)	following -->	It specifies all nodes that come after the current node.
//4)	following-sibling	-->It specifies the following siblings of the context node. Siblings are at the same level as the current node and share it's parent.
//6)	parent	-->>It specifies the parent of the current node.
//7)	preceding	-->>It specifies all nodes that come before the current node (i.e. before it's opening tag).
//8)	self	It specifies the current node.
//
//A list of various Axis values:
//
//Index	Axis	Description
//1)	ancestor	It specifies the ancestors of the current nodes which include the parents up to the root node.
//2)	ancestor-or-self	It specifies the current node and its ancestors.
//3)	attribute	It specifies the attributes of the current node.
//4)	child	It specifies the children of the current node.
//5)	descendant	It specifies the descendants of the current node i.e. the node's children up to the leaf node(no more children).
//6)	descendant-or-self	It specifies the current node and it's descendants.
//7)	following	It specifies all nodes that come after the current node.
//8)	following-sibling	It specifies the following siblings of the context node. Siblings are at the same level as the current node and share it's parent.
//9)	namespace	It specifies the namespace of the current node.
//10)	parent	It specifies the parent of the current node.
//11)	preceding	It specifies all nodes that come before the current node (i.e. before it's opening tag).
//12)	self	It specifies the current node.
//[5/14/2024 10:50 PM] Abhijeet Chillal: 
//	
//	
//	package AdvanceXpth;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Xpath1 {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RKENDRE\\Desktop\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//		driver.get("https://demo.automationtesting.in/Register.html");
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		// Absolute Xpath
//
////		
////		Thread.sleep(3000);
////		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div/div/input")).sendKeys("Ketan");
////
////		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div/div[2]/input")).sendKeys("Jadhav");
////	
////		//Relative Xpath
////		
////		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("QWE");
////		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("WERTYU");
////		
////		Thread.sleep(3000);
//
//		// Xpath with or
//
////		A             B         Result  				
////		False        False  --  No element
////		True         False  --  True
////		False        True   --  True
////		True         True   --  True 
//
////		driver.findElement(By.xpath("//input[@type=\"tex\" or @placeholder=\"First Nam\"]")).sendKeys("QWERT");
////		driver.findElement(By.xpath("//input[@type=\"tex\" or @placeholder=\"Last Nam\"]")).sendKeys("QWERT");
//
////		driver.findElement(By.xpath("//input[@type=\"text\" or @placeholder=\"First Nam\"]")).sendKeys("ASDF");
////
////		driver.findElement(By.xpath("(//input[@type=\"text\" or @placeholder=\"Last Nam\"])[2]")).sendKeys("ASDF");
////		
//
////		driver.findElement(By.xpath("//input[@type=\"tex\" or @placeholder=\"First Name\"]")).sendKeys("123");
////		driver.findElement(By.xpath("//input[@type=\"tex\" or @placeholder=\"Last Name\"]")).sendKeys("1234");
////		
////		driver.findElement(By.xpath("//input[@type=\"text\" or @placeholder=\"Last Name\"]")).sendKeys("124");
////		driver.findElement(By.xpath("//input[@type=\"text\" or @placeholder=\"Last Name\"]")).sendKeys("QWERT");
//
//		// Xpath with And
//
////		A             B         Result  				
////		False        False  --  No element
////		True         False  --  No element
////		False        True   --  No element
////		True         True   --  True 	
//
//		driver.findElement(By.xpath("//input[@type=\"text\" and @placeholder=\"First Name\"]")).sendKeys("qwert");
//		driver.findElement(By.xpath("//input[@type=\"text\" and @placeholder=\"Last Name\"]")).sendKeys("@#$%^");
//
//// Chained Xpath
//
//		driver.findElement(By.xpath("//div[@class=\"col-md-4 col-xs-4 col-sm-4\"]//input[@placeholder=\"First Name\"]"))
//				.sendKeys("QWERT");
//		driver.findElement(By.xpath("//div[@class=\"col-md-4 col-xs-4 col-sm-4\"]//input[@placeholder=\"Last Name\"]"))
//				.sendKeys("ERTY");
//		Thread.sleep(5000);
//
//		driver.quit();
//
//	}
//
//}
//[5/14/2024 10:50 PM] Abhijeet Chillal: 
//	
//	package AdvanceXpth;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Xpath2 {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RKENDRE\\Desktop\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		/*
//		 * Xpath axces XPath axes are used to identify elements by their relationship
//		 * like parent, child, sibling, etc. Axes refer to axis on which elements are
//		 * lying relative to an element.
//		 */
//		
//		/* Xpath Axces
//		1. Self
//		2. Parent
//		3. Ancestor
//		4. Following
//		5. Following-sibling
//		6. Preceding
//		7. Preceding-sibling
//		8. Child
//		9. Descedent 
//		*/
////	1.	Self
//	
//	String Text=driver.findElement(By.xpath("//a[contains(text(),'TVS Motor Co. Ltd.')]/self::a")).getText();
//	System.out.println(Text);
//	
//	//Parent
//	String Text1=driver.findElement(By.xpath("//a[contains(text(),'TVS Motor Co. Ltd.')]/parent::td")).getText();
//	Thread.sleep(4000);
//	
//	//Child
//	List<WebElement>ChildCount=driver.findElements(By.xpath("//a[contains(text(),'TVS Motor Co. Ltd.')]/ancestor::tr/child::td"));
//	System.out.println("Number of child element "+ChildCount.size());
//	
//	//Ancestor- Print all the row data
//	
//	String Text2=driver.findElement(By.xpath("//a[contains(text(),'TVS Motor Co. Ltd.')]/ancestor::tr")).getText();
//	System.out.println(Text2);
//	driver.quit();
//	
//	
//	}
//
//}
//[5/14/2024 10:50 PM] Abhijeet Chillal: 
//	
//	
//	
//	package AdvanceXpth;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Xpath3 {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RKENDRE\\Desktop\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//Descendant
//		List<WebElement>List1=driver.findElements(By.xpath("//a[contains(text(),'TVS Motor Co. Ltd.')]/ancestor::tr/descendant::td"));
//	    System.out.println("Number of descendant nodes :"+List1.size());
//	    
//	    //Following
//	    List<WebElement>List2=driver.findElements(By.xpath("//a[contains(text(),'TVS Motor Co. Ltd.')]/following::tr"));
//	    System.out.println("Number of following nodes :"+List2.size());
//
//	    //Following -sibling
//	    List<WebElement>List3=driver.findElements(By.xpath("//a[contains(text(),'TVS Motor Co. Ltd.')]/ancestor::tr/following-sibling::tr"));
//	    System.out.println("Number of following nodes :"+List3.size());
//	    
//	    //preceding
//	    List<WebElement>List4=driver.findElements(By.xpath("//a[contains(text(),'TVS Motor Co. Ltd.')]/ancestor::tr/preceding::tr"));
//	    System.out.println("Number of preceding nodes :"+List4.size());
//
//	    //Preceding-sibling
//	    List<WebElement>List5=driver.findElements(By.xpath("//a[contains(text(),'TVS Motor Co. Ltd.')]/ancestor::tr/preceding-sibling::tr"));
//	    System.out.println("Number of preceding-sibling nodes :"+List5.size());
//
//	    Thread.sleep(4000);
//	    driver.quit();
//	}
//
//}