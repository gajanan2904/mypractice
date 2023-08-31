package misiion_job;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipke_elementHandling1 {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
//		
//	WebDriver driver=new ChromeDriver();
//	
//	driver.get("https://www.google.com/");
//	driver.manage().window().maximize();
//	Thread.sleep(1000);
//	
//	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//	
//	System.out.println("Total Links are "+allLinks.size());
//	
//	for (WebElement w:allLinks)
//	{
//		System.out.println(w.getText());
//	}
//	
		
		//for multiple checkBoxes
		
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe")	;
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	List<WebElement> allcheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	
	for(WebElement w:allcheckBox)
	{
		Thread.sleep(1000);
		w.click();
	}
	for(WebElement w:allcheckBox)
	{
		Thread.sleep(1000);
		w.click();
	}
	
	
	
	
	}

}
