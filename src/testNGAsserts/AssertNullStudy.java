package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullStudy {
  @Test
  public void f() 
  {
	  String name=null;
	  String name1="gaju";
	  
	  Assert.assertNull(name,"String is not Null");
	  System.out.println("TC is pass");
	  
	  Assert.assertNull(name1,"String is not Null");
	  System.out.println("TC is fail");
	  
	  //here line no 17 not executed this is disadvantage of hard assert
	  //if any of the verification point is fail then remaning point not executed
  }
}
