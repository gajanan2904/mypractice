package flipkartTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FlipkartPOM.FlipkartHomePage;
import FlipkartPOM.FlipkartLogin;
import FlipkartPOM.FlipkartPopup;
import baseClasses.BaseClass;
import utilityPackage.UtilityClass;

public class FlipkartUserNameValidation extends BaseClass
{  
	FlipkartPopup popup;
	FlipkartLogin login;
	FlipkartHomePage home;
	
	@BeforeClass
 public void LaunchingBrowser()
 {
	 LaunchBrowser();
	 new FlipkartPopup(driver);
	 new FlipkartLogin(driver);
	 new FlipkartHomePage(driver);
	 
 }
 @BeforeMethod
 public void LoginToFlipkart() throws EncryptedDocumentException, IOException, InterruptedException
 {
	 popup.clickPopup();
	 Thread.sleep(1000);
	 login.clickOnLogin();
	 login.EnterMObNO(UtilityClass.getExcelSheet(0, 0));
	 login.EnterPassword(UtilityClass.getExcelSheet(0, 1));
	 login.clickOnLoginButton();
 }
@Test
public void Validation() throws EncryptedDocumentException, IOException
{   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	String ActUserName = home.getUserName();
	String ExpectedUserName=UtilityClass.getExcelSheet(0, 2);
	
	Assert.assertEquals(ActUserName, ExpectedUserName,"Expected and Acutal username not matching");
}
	
}
