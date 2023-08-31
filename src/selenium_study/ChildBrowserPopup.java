package selenium_study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//String mainpageID = driver.getWindowHandle();
	//	System.out.println("main page id is "+mainpageID);
		
		
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		
		
		Set<String> allpageID = driver.getWindowHandles();
		
		Iterator<String> it=allpageID.iterator();
		
		String mainpageID = it.next();
		String childpageID = it.next();
		
		driver.switchTo().window(childpageID);
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("selenium");
		Thread.sleep(2000);
		
		driver.close();
		
		driver.switchTo().window(mainpageID);
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("home")).click();
		Thread.sleep(2000);
		
		driver.close();
		
		
		

	}

}
 