package testNGKkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
  @Test
  public void TC1() 
  {
	  Reporter.log("running test case 1",true);
  }
  
  @Test(timeOut = 1000 )
  public void TC2() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("running test case 2",true);
  }
}
