package testNGSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
	
	SoftAssert s=new SoftAssert();
  @Test
  public void f() 
  {
	  String name="gaju";
	  String name1="gaju";
	  String name2="gaju2";
	  
	  s.assertEquals(name, name2,"String is not Equal");
	  
	  s.assertNotEquals(name1, name,"String is Equal");
	  
	  s.assertAll();
	  //here note that after the failure of verification point in line no 16
	  //still program executed further..this is adv of soft assert
  }
}
