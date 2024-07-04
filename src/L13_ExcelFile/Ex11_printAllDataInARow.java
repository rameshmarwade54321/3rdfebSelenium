package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex11_printAllDataInARow 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file= new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int col = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=col; i++)
		{
			Cell cl = sh.getRow(0).getCell(i);
			CellType s1 = cl.getCellType();
			
			if(s1==CellType.STRING)
			{
				System.out.print(cl.getStringCellValue()+" ");
			}
			else if(s1==CellType.NUMERIC)
			{
				System.out.print(cl.getNumericCellValue()+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				System.out.print(cl.getBooleanCellValue()+" ");
			}
		
		}
		
		
		
		
	}
}
