package excelStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		 FileInputStream myfile=new FileInputStream("E:\\excelTest.xlsx");
		 
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		//here we read frist complet row
		
		for(int i=0;i<=3;i++)
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+ " ");
			
		//point to remeber>> suppose we remove mh from row0 and cell 3 then their is null pointer exception
		//if we add india next to mh then this above code is unable to read..just bcaz this is static coding
			
			
		}
		System.out.println();
		System.out.println("=================");
		//now we are going to read whole sheet  r=row c=col
		
		for (int r=0;r<=1;r++)
		{
			for(int c=0;c<=3;c++)
			{
				String value1 = mySheet.getRow(r).getCell(c).getStringCellValue();
				System.out.print(value1+" ");
			}
			System.out.println();
		}
		

	}

}
