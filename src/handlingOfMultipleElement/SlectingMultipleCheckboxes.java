package handlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlectingMultipleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println("no of checkboxes "+checkboxes.size());
        
		for(WebElement w:checkboxes)//select
		{
			Thread.sleep(1000);
			w.click();
		}
		
		for(WebElement w:checkboxes)
		{
			w.click();
		}
		
		
	}

}
