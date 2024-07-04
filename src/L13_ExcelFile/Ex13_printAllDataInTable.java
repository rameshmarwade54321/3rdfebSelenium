package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex13_printAllDataInTable

{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file= new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet4");
		
		int rows = sh.getLastRowNum();
		
		for(int i=0; i<=rows; i++)
		{
			
			int col = sh.getRow(i).getLastCellNum()-1;
			for(int j=0; j<=col; j++)
			{
			Cell cl = sh.getRow(i).getCell(j);
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
			System.out.println();
		}
		
		
		
		
	}
}
