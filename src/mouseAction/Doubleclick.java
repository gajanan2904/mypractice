package mouseAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		
		Actions act=new Actions(driver);
		
		//act.doubleClick(doubleclick).perform();
		
		act.moveToElement(doubleclick).doubleClick().build().perform();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
}
}
