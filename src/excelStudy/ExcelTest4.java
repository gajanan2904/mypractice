package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("E:\\\\excelTest.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		CellType type1 = mySheet.getRow(0).getCell(0).getCellType();
		CellType type2 = mySheet.getRow(0).getCell(1).getCellType();
		CellType type3 = mySheet.getRow(0).getCell(2).getCellType();
		
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		
		String value1 = mySheet.getRow(0).getCell(0).getStringCellValue();
		double value2 = mySheet.getRow(0).getCell(1).getNumericCellValue();
		boolean value3 = mySheet.getRow(0).getCell(2).getBooleanCellValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		  
		
	}

}
