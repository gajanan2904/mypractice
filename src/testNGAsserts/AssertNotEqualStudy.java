package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEqualStudy {
  @Test
  public void f()
  {
	  String name="gaju";
	  String name1="gaju1";
	  
	  Assert.assertNotEquals(name, name1,"Strings are equal");
  }
}
