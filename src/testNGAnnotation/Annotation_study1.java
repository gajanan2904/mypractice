package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_study1 
{
 
	@BeforeClass
	public void launchBrowser() 
	{
		Reporter.log("launching Browser",true);
	}
	
	@BeforeMethod
	public void Login()
	{
		Reporter.log("login in page",true);
	}
	
	@Test
    public void validateUserID() 
  {
	  Reporter.log("validating userID",true);
  }
	
	@AfterMethod
	public void Logout()
	{
		Reporter.log("logouted through page",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closing Browser",true);
	}
  
  
}
