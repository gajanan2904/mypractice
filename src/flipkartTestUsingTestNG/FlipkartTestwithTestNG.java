package flipkartTestUsingTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartTestwithTestNG
{ 
	WebDriver driver;
    Sheet mySheet;
    FlipkartPopup popup;
    FlipkartLogin login;
    FlipkartHomepage home;
  @BeforeClass
 
  public void browserLaunch() throws EncryptedDocumentException, IOException
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
	ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		Reporter.log("browser is launching",true);
	    driver=new ChromeDriver(opt);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Reporter.log("Excel sheet get fetching",true);
		FileInputStream myFile=new FileInputStream("E:\\excelTest.xlsx");
		
	    mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	    Reporter.log("creating object",true);
		popup=new FlipkartPopup(driver);
		login=new FlipkartLogin(driver);
		home=new FlipkartHomepage(driver);
		
	}
  @BeforeMethod
//  public void popupFlipkart()
//  {
//	  Reporter.log("popup is handling",true);
//	  popup.popuphandle();
//  }
  public void loginFlipkart()
  {   
	  Reporter.log("popup is handling",true);
	  popup.popuphandle();
  
	  Reporter.log("loging in Flipkart",true);
	  login.clickOnLogin();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  login.enterMobNo(mySheet.getRow(0).getCell(0).getStringCellValue());
	  login.enterPW(mySheet.getRow(0).getCell(1).getStringCellValue());
	  login.clickonLoginButton();
	  Reporter.log("login sucessful",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
  }
  
  @Test
  
  public void validating() throws InterruptedException
  {   
	  Reporter.log("validating data",true);
	Thread.sleep(10000);
	  String expectedUsername = mySheet.getRow(0).getCell(2).getStringCellValue();
	  
	  String actualUserName=home.getUsername();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	  
	  Assert.assertEquals(actualUserName, expectedUsername,"ActualUserName & ExpectedUsername Not matching");
	  Reporter.log("data validated",true);
  }
  
  @AfterMethod
  public void logoutprint()
  {
	  System.out.println("logout");
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("browser closing",true);
	  driver.close();
  }
}
