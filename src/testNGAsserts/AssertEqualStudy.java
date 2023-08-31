package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualStudy {
  @Test
  public void f() 
  {
	  String name="pune";
	  
	  String name1="pune1";//1.frist time check name1=pune    TC is passed
	                       //2.second time name1=pune1  msg on console TC is failed but in result TC is pass
	  
//	  if(name.equals(name1))
//	  {
//		  System.out.println("TC is passed");
//	  }
//	  else
//	  {
//		  System.out.println("TC is failed");
//	  }
//	  
	  
	  Assert.assertEquals(name, name1,"String is not matching");
  }
}
