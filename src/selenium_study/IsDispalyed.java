 package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class IsDispalyed {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(c);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement DisplayedText = driver.findElement(By.id("displayed-text"));
		
		boolean result = DisplayedText.isDisplayed();
		System.out.println("Text box status is "+result);
		
		WebElement TextboxHide = driver.findElement(By.id("hide-textbox"));
		TextboxHide.click();
		
		 boolean result2 = DisplayedText.isDisplayed();
		 System.out.println("updated text box state is "+result2);
		
		
	}

}
