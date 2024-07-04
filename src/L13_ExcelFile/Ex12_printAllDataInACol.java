package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex12_printAllDataInACol 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file= new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int rows = sh.getLastRowNum();
		
		for(int i=0; i<=rows; i++)
		{
			Cell cl = sh.getRow(i).getCell(0);
			CellType s1 = cl.getCellType();
			
			if(s1==CellType.STRING)
			{
				System.out.println(cl.getStringCellValue()+" ");
			}
			else if(s1==CellType.NUMERIC)
			{
				System.out.println(cl.getNumericCellValue()+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				System.out.println(cl.getBooleanCellValue()+" ");
			}
		
		}
		
		
		
		
	}
}
