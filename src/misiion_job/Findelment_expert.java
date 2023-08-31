package misiion_job;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Findelment_expert 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
//	driver.get("https://vctcpune.com/selenium/practice.html");
//	driver.manage().window().maximize();
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("//input[@value='Radio1']")).click();
//	Thread.sleep(3000);
//	
//	driver.findElement(By.id("autocomplete")).sendKeys("india");
//	Thread.sleep(2000);
//	
//	driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).clear();
//	
//	WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
//	
//	Select list=new Select(dropdown);
//	
//	list.selectByVisibleText("Option1");
//	Thread.sleep(3000);
//	list.selectByValue("option2");
//	Thread.sleep(3000);
//	list.selectByIndex(3);
//	
//	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	
//	RandomString name=new RandomString(2);
//	
//	File destination=new File("E:\\screenshots\\myjob "+name+".jpg");
//	
//	FileHandler.copy(source, destination);
//	
//	WebElement BOx = driver.findElement(By.name("show-hide"));
//	
//	boolean result = BOx.isDisplayed();
//	
// System.out.println("result is "+result);
	
	driver.get("https://www.discoveryplus.in/?gclid=Cj0KCQjwmouZBhDSARIsALYcourcobOD5eNaELNhx1sPnCwhRYazTGH1SCdU2X8Ko034Oc2oEB_xePgaAtULEAL");
    driver.manage().window().maximize();
    Thread.sleep(4000);
    
    driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
    Thread.sleep(2000);
    
     WebElement getOtp = driver.findElement(By.tagName("button"));
     
      boolean result = getOtp.isEnabled();
      
      if(result)
      {
    	  System.out.println("getotp buttton is enanbled");
      }
      else
      {
    	  driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
    	  Thread.sleep(2000);
    	  getOtp.click();
      }
    
}
}
