package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndFalseStudy {
  @Test
  public void f()
  {
	  boolean result=true;
	  
	  boolean result1=false;
	  
	  Assert.assertTrue(result,"result is false");
	  
	  Assert.assertFalse(result1,"result is true");
  }
}
