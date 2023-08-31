package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetText {

	public static void main(String[] args) 
	
	{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		
		driver.get("https://msbte.org.in/");
		driver.manage().window().maximize();
		
	   driver.findElement(By.xpath("//p[text()='MSBTE EVENTS']"));
	//  System.out.println(driver.findElement(By.xpath("//p[text()='MSBTE EVENTS']")).getText());
	   
	  WebElement webEle = driver.findElement(By.xpath("//p[text()='MSBTE EVENTS']"));
	  
	 String ActualText = webEle.getText();
	 String Expected="MSBTE EVENTS";
	 
	   if(ActualText.equals(Expected))
	   {
		   System.out.println("TC is pass  text is correct");
	   }
	   else
	   {
		   System.out.println("TC is fail pls raise defect");
	   }
	   
	}

}
