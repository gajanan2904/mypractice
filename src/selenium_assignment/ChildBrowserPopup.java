package selenium_assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//practice of childbrowser popup for handling of new tab
public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException
	{
		
     System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
     
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://vctcpune.com/selenium/practice.html");
     driver.manage().window().maximize();
     Thread.sleep(2000);
     
     driver.findElement(By.id("opentab")).click();
     Thread.sleep(2000);
     
     Set<String> allpageID = driver.getWindowHandles();
     
     Iterator<String> it=allpageID.iterator();
     
    String mainpageID = it.next();
     String newtabID = it.next();
     
     driver.switchTo().window(newtabID);
     
     driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
     Thread.sleep(2000);
     driver.close();
     
     
	}

}
