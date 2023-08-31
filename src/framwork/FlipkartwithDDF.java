package framwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartwithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("E:\\excelTest.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		
		String mobNo = mySheet.getRow(0).getCell(0).getStringCellValue();
		String passWord = mySheet.getRow(0).getCell(1).getStringCellValue();
		String expectedValue = mySheet.getRow(0).getCell(2).getStringCellValue();
		
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(mobNo);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(passWord);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		String actualName = driver.findElement(By.xpath("(//div[@class='exehdJ'])[1]")).getText();
		
		
		if(actualName.equals(expectedValue))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
		
		//driver.findElement(By.xpath("//a"))
	}

}
