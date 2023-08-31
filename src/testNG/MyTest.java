package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void method1() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  driver.manage().window().maximize();
  }
  @Test
  public void method2()
  {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://twitter.com/i/flow/login");
	  
	  driver.manage().window().maximize();
  }
  @Test
  public void method3() 
  {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/Books-Login/s?rh=n%3A976389031%2Cp_27%3ALogin");
	  
	  driver.manage().window().maximize();
  }
  @Test
  public void method4()
  {
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/login/");
	  
	  driver.manage().window().maximize();
  }
}
