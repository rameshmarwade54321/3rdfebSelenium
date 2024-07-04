package L26_POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass
{

	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Salenium Software\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}
}
