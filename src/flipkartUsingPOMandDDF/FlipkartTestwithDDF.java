package flipkartUsingPOMandDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartTestwithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream myfile=new FileInputStream("E:\\excelTest.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		FlipkartPopup popup=new FlipkartPopup(driver);
		popup.clickOnPopup();
		Thread.sleep(2000);
		
		FlipkartLogin login=new FlipkartLogin(driver);
		login.clickOnLoginButton();
		login.enterMobNo(mySheet.getRow(0).getCell(0).getStringCellValue());
		login.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		login.clickOnLogin();
		Thread.sleep(1000);
		
		FlipkartHomepage home=new FlipkartHomepage(driver);
		home.validateUsername(mySheet.getRow(0).getCell(2).getStringCellValue());
		
		driver.close();
		
		

	}

}
