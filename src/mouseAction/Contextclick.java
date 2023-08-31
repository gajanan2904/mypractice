package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        
		WebDriver driver=new ChromeDriver();
		//span[text()='right click me']
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		
		//act.contextClick(rightclickbutton).perform();
		
		act.moveToElement(rightclickbutton).contextClick().build().perform();
		
		
		
	}

}
