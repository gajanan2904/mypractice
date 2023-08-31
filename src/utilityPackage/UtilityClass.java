package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	static Sheet Mysheet;

public static String getExcelSheet(int RowCount,int columnCount) throws EncryptedDocumentException, IOException
{
FileInputStream myFile=new FileInputStream("E:\\excelTest.xlsx")	;
Mysheet = WorkbookFactory.create(myFile).getSheet("Sheet5");

String sheetValue = Mysheet.getRow(RowCount).getCell(columnCount).getStringCellValue();
return sheetValue;
}

public static void takeScrrenShot(WebDriver driver ,int TCID) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dstn=new File("E:\\TC"+TCID+".jpg");
	FileHandler.copy(src, dstn);

}
}
