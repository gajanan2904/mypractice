package selenium_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
    
    WebDriver driver=new ChromeDriver();
    
    driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU1MzYzMTI1LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
    driver.manage().window().maximize();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gajanan adwe");
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
    
	}

}
