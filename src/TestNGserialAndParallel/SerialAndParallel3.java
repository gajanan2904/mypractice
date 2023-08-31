package TestNGserialAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerialAndParallel3 {
	@Test
	  public void Mymethod() 
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://kite.zerodha.com/");
		  
		  driver.manage().window().maximize();
		  
		  driver.close();
	  }
}
