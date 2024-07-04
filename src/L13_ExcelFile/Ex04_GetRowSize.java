package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex04_GetRowSize
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new  FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		
 int value = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
		
	System.out.println(value);
	
	}
}
