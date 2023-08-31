package handlingOfMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksInPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("total links in page are "+totalLinks.size());
		
		for(WebElement w:totalLinks)
		{
			System.out.println(w.getText());
		}
	}

}
