package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest2 {
  @Test
  public void method1() 
  {
	  System.out.println("hi welcome to test NG1");
  }
  @Test
  public void method2() 
  {
	  System.out.println("hi welcome to test NG2");
	  Reporter.log("hi welcome to test NG2",true);
  }
}
