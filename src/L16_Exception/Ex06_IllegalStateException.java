package L16_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex06_IllegalStateException 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		String s1 = sh.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(s1);
	}
}
