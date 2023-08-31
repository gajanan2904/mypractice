package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/?gclid=EAIaIQobChMI2tW91oS1-AIVgh0rCh3LMAjFEAAYASAAEgJKK_D_BwE");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(10000);
		
		WebElement GetOTPbutton = driver.findElement(By.tagName("button"));
		boolean result = GetOTPbutton.isEnabled();
		Thread.sleep(10000);
		
		if(result)
		{   
			System.out.println("Get otp button is enabled");
			GetOTPbutton.click();
			
		}
		else
		{
			driver.findElement(By.tagName("input")).sendKeys("8888888888");
			Thread.sleep(10000);
			GetOTPbutton.click();
			
		}
	}

}
