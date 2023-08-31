package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement checkboxopt1 = driver.findElement(By.id("checkBoxOption1"));
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].scrollIntoView();",checkboxopt1);
		
        checkboxopt1.click();
	}

}
