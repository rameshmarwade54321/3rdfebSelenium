package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex07_printAllDataInACol
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");		
		
       int rows = sh.getLastRowNum();
	   System.out.println(rows);
       for(int i=0; i<=rows; i++)
       {
    	   System.out.println(sh.getRow(i).getCell(3).getStringCellValue()+" ");
    	   
       }
	 
	}
}
