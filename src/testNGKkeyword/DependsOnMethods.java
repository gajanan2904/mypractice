package testNGKkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods
{
  @Test(dependsOnMethods = {"B"})
  public void A()
  {
	  Reporter.log("running Test Case A",true);
  }
  
  @Test(timeOut=500)
  public void B() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("running Test Case B",true);
  }
  
  @Test
  public void C()
  {
	  Reporter.log("running Test Case C",true);
  }
  
  @Test
  public void D()
  {
	  Reporter.log("running Test Case D",true);
  }
  
  
}
