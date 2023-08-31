package selenium_study;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//1.
		WebElement MultipleSelectDD = driver.findElement(By.id("cars"));
		
		//2.
		Select s=new Select(MultipleSelectDD);
		
		//3.
		boolean result = s.isMultiple();
		System.out.println("mutliple select allow status "+result);
		
		Thread.sleep(2000);
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("opel");
		
		s.deselectAll();
				
	}

}
