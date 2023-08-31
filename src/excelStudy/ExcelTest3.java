package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 public class ExcelTest3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("E:\\\\excelTest.xlsx");
		
	Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
	
	//here we done dyanmic coding,for that we required code which count row and colume
	//remember row count start from 0 & cell count start from 1
	
	int totalRow = mySheet.getLastRowNum();
	
	int totalcell=mySheet.getRow(0).getLastCellNum()-1;
	
	for(int i=0;i<=totalRow;i++)
	{
		for(int j=0;j<=totalcell;j++)
		{
			String value = mySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	//remeber in that sheet we only consider string value,but if we add numeric value in excel sheet
	//but return type of value is string then at time their is illegal state exception
	
	
	}
}
