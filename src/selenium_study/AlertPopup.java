package selenium_study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException
	{
     System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement clickButton = driver.findElement(By.id("confirmButton"));
		clickButton.click();//if u comment this their is no alert exception
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		String alerttext = alt.getText();
		System.out.println("alert text is "+alerttext);
		alt.accept();
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("timerAlertButton")).click();
	    Thread.sleep(6000);
		Alert alt3 = driver.switchTo().alert();
		alt3.accept();
		
		

	}

}
