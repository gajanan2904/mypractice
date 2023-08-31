package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("velocity");
		
	}

}

