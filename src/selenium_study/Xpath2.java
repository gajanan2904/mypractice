package selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath2 {//xpath class id name tagname linked text partial linked text

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU1NDU4NjY4LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
        Thread.sleep(2000);
        
        //use of xpath
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("gaju");
        Thread.sleep(2000);
        
        //use of name
        driver.findElement(By.name("email")).clear();
        Thread.sleep(2000);
        
        //use of id
       driver.findElement(By.id("email")).sendKeys("gajanan adwe");
        
        // use of class and xpath    Compound class names not permitted
      //  driver.findElement(By.className("inputtext _55r1 inputtext _9npi inputtext _9npi")).sendKeys("123");
       
       driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']")).sendKeys("123");
        Thread.sleep(2000);
        
        //use of id
        driver.findElement(By.id("loginbutton")).click();
        
        //use of linkText
        driver.findElement(By.linkText("Forgotten password?")).click();
        
        
        
        
	}

}
