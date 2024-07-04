package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex08_printAllDataInTable
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");		
		
       int rows = sh.getLastRowNum();
	   System.out.println(rows);
       for(int i=0; i<=rows; i++)
       {
    	   int col = sh.getRow(i).getLastCellNum()-1;
    	   for(int j=0;j<=col; j++ )
    	   {
    		   String value = sh.getRow(i).getCell(j).getStringCellValue();
    		   System.out.print(value+" ");
    	   }
    	   System.out.println();
       }
	 
	}
}
