package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex01_GetStringData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//navigate excel path
		FileInputStream file=new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		
//		//open excel
//		Workbook book = WorkbookFactory.create(file);
	
//		//navigate to sheet
//		Sheet sh = book.getSheet("Sheet1");
//		
//		//navigate to row
//		Row rw = sh.getRow(0);
//		
//		//navigate to cell
//		Cell cl = rw.getCell(0);
//		
//		//get string data
//		String s1 = cl.getStringCellValue();
//		
//		//print
//		System.out.println(s1);
		
		
		String s2 = WorkbookFactory.create(file).getSheet("Sheet").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s2);
		
	}
}
