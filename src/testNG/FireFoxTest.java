package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
  @Test
  public void f()
  {
System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
	  
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("https://www.facebook.com/login/");
	  
	  driver.manage().window().maximize();
  }
  }

