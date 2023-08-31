package testNGAsserts;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFailStudy {
  @Test
  public void f()
  {
	  String name=null;
	  Assert.fail();
	  
	  Assert.assertNull(name,"value is not null");
	  
	  
  }
}
