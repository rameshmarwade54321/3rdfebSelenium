package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex02_GetNumericData 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new  FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		
	double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue();		
		
	System.out.println(value);
	
	}
}
