package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CT1
{
  @Parameters("browserName")
  @Test
  public void crossBrowser(String browserName) 
  {
	  WebDriver driver=null;
	  if (browserName.equals("chrome")) 
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  
		   driver=new ChromeDriver();
		  
		 
	}
	  else if(browserName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		  
		   driver=new FirefoxDriver();
		  
		  
	  }
	  driver.get("https://www.facebook.com/login/");
}
}
