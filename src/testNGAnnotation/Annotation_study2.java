package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_study2 
{
  @Test
  public void a() 
  {
	  Reporter.log("Running test case A",true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("Running test case B",true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("Running test case C",true);
  }
  
  @BeforeClass
  public void Beforeclass()
  {
	  Reporter.log("before class method is Running",true);
  }
  
  @AfterClass
  public void Afterclass()
  {
	  Reporter.log("after class method is Running",true);
  }
  
  @BeforeMethod
  public void Beforemethod()
  {
	  Reporter.log("before method is Running",true);
  }
  
  @AfterMethod
  public void Aftermethod()
  {
	  Reporter.log("after method is Running",true);
  }
  //follow alpahbetical sequence during execution-->@Test
}
