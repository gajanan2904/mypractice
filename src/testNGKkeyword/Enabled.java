package testNGKkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  @Test
  public void TC1()
  {
	  Reporter.log("running Test case 1 ",true);
  }
  
  @Test(enabled = false)
  public void TC2()
  {
	  Reporter.log("running Test case 2 ",true);
  }
}