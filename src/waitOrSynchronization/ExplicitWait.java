package waitOrSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/?gclid=EAIaIQobChMI2tW91oS1-AIVgh0rCh3LMAjFEAAYASAAEgJKK_D_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		WebElement GetOTPbutton = driver.findElement(By.tagName("button"));
		
		driver.findElement(By.tagName("input")).sendKeys("8888888888");
		
		//1.create a object of webdriverWait and pass driver and time unit as argument
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(2000));
		
		//2.using webdriver object call waiting method
		
		w.until(ExpectedConditions.visibilityOf(GetOTPbutton));
        
		GetOTPbutton.click();
	}

}
