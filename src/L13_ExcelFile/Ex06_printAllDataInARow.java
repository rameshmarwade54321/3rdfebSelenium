package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex06_printAllDataInARow 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");		
		
       int columns = sh.getRow(0).getLastCellNum()-1;
	   
       for(int i=0; i<=columns; i++)
       {
    	   System.out.print(sh.getRow(0).getCell(i).getStringCellValue()+" ");
    	   
       }
	 
	}
}
