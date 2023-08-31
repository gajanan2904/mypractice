package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
       //in this we are learn to read how to read differnt differnt data of excel 
		
		FileInputStream myFile=new FileInputStream("E:\\\\excelTest.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		
		
		int rowCount = mySheet.getLastRowNum();
		
		int cellCount = mySheet.getRow(0).getLastCellNum()-1;
		
		System.out.println(rowCount);
	       System.out.println(cellCount);
		
		
		
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<=cellCount;j++)
			{
				CellType type = mySheet.getRow(i).getCell(j).getCellType();
				
				if(type==type.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
				}
				else if(type==type.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+" ");
				}
				else if(type==type.NUMERIC)
				{
					double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(type==type.BLANK)
				{
					System.out.println("blank");
				}
			}
			System.out.println();
		}

	}

}
