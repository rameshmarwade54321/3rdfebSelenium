package L13_ExcelFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex05_GetColumnSize
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new  FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		
		int colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(colSize);
	
	}
}
