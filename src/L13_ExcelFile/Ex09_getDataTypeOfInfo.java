package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex09_getDataTypeOfInfo 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new FileInputStream("C:\\\\Salenium Software\\\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		CellType cellinfo = sh.getRow(0).getCell(0).getCellType();
		
		System.out.println(cellinfo);
		
	}
}
