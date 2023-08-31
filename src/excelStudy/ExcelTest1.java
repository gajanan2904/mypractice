package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
     FileInputStream myfile=new FileInputStream("E:\\excelTest.xlsx");
// String value = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
     
//  System.out.println(value);
   
 // double value2 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	
 //  System.out.println(value2);//when run their is empty file exception
   
   //exception occour becaz of we create different different object for for file such as value and value2
   //for such kind of exception remidy is we have to store our file in one object
   //frist we have to remember return type of all the object
   
   Workbook MyTest = WorkbookFactory.create(myfile);
   Sheet MySheet = MyTest.getSheet("Sheet1");
   Row MyRow = MySheet.getRow(0);
   Cell MyCell = MyRow.getCell(2);
   MyCell.getNumericCellValue();
	
   //for avoid exception we need to follow following method
   
   System.out.println(MySheet.getRow(0).getCell(0).getStringCellValue());
   System.out.println(MySheet.getRow(0).getCell(2).getNumericCellValue());
	}

}
