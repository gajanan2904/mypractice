package handlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(1000);
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul//li[@role='presentation']"));
		
		for(WebElement w:suggestion)
		{
			String ActualOutput = w.getText();
			
			String ExpectedOutput = "honda showroom near me"		;
		
		     if(ActualOutput.equals(ExpectedOutput))
		     {
		    	 w.click();
		    	 break;
		     }
		}
		
		Thread.sleep(2000);
	 driver.findElement(By.linkText("Images")).click();
	}

}
