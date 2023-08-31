package handlingOfMultipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion2 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe")	;
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("q")).sendKeys("i phone");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(2000);
	
	String Rating = driver.findElement(By.xpath("(//div[@class='col col-7-12']//span)[2]")).getText();
	
    System.out.println("Rating and Review of the product is "+Rating);
	}

}
