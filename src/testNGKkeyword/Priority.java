package testNGKkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test
  public void A()
  {
	  Reporter.log("running Test case A",true);
  }
  
  @Test(priority = -1)
  public void B()
  {
	  Reporter.log("running Test case B",true);
  }
  
  @Test
  public void C()
  {
	  Reporter.log("running Test case C",true);
  }
}
