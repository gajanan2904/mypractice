package baseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class BaseClass
{
	    protected WebDriver  driver;
        public void LaunchBrowser()
{
	    System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	
	    ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		
	    driver=new ChromeDriver(opt);
	    Reporter.log("browser is launching",true);
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
}
        public void closebrowser()
        {
        	driver.close();
        	Reporter.log("browser is closing",true);
		{
			
		}
		
}
}
