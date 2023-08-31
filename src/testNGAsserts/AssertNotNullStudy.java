package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNullStudy {
  @Test
  public void f() 
  {
	  String name=null;
	  String name1="gaju";
	  
	  Assert.assertNotNull(name,"String is  Null");
	  System.out.println("TC is fail");
	  
	  Assert.assertNotNull(name1,"String is Null");
	  System.out.println("TC is pass");
	  
	  //from line no 13 coding not executed
  }
}
