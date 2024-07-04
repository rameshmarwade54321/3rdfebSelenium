package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex03_GetBooleanData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new  FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		
	 boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();		
		
	System.out.println(value);
	
	}
}
