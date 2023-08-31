package misiion_job;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_expert {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://demoqa.com/alerts");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
//		
//		Alert alt = driver.switchTo().alert();
//		
//		System.out.println(alt.getText());
//		Thread.sleep(2000);
//		
//		alt.accept();
//		
//		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(6000);
//		Alert alt2 = driver.switchTo().alert();
//		
//		
//		alt2.accept();
		
		//2.hiddendivision popup
		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		
		//3.iframe
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		
	}

}
