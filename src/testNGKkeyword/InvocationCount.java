package testNGKkeyword;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount = 5)
  public void a() 
  {
	  Reporter.log("running method A",true);
  }
  @Test
  public void b() 
  {
	  Reporter.log("running method B",true);
  }
  
 @BeforeMethod
 public void beforeMethod()
 {
	 Reporter.log("running before method",true);
 }
}
