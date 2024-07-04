package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex10_getDataByVerifying_TypeOfInfo
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new FileInputStream("C:\\\\Salenium Software\\\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		Cell cl = sh.getRow(1).getCell(1);
	    CellType s1 = cl.getCellType();
		System.out.println(s1);
		
		if(s1==CellType.STRING)
		{
			String value = cl.getStringCellValue();
			System.out.println(value);
		}
		else if(s1==CellType.NUMERIC)
		{
			 double value = cl.getNumericCellValue();
			 System.out.println(value);
		}
		else if(s1==CellType.BOOLEAN)
		{
			boolean value = cl.getBooleanCellValue();
			System.out.println(value);
		}
		
	}
}
